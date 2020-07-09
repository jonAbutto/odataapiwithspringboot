package com.consumeodata.odata.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.consumeodata.odata.models.Products;
import com.consumeodata.odata.models.Value;
import com.consumeodata.odata.odatawebservices.ProductsService;
import com.consumeodata.odata.odatawebservices.utils.ErrorUtils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdataController {

    @RequestMapping(value = "/products", produces = "applicaction/json", method = RequestMethod.GET)
    public String okhttpProducts(@RequestParam(value = "userId") String userId) throws IOException {
        final ProductsService prodService = new ProductsService();
        return prodService.getProductsWithOkHttp(userId);
    }

    @RequestMapping(value = "/prods", produces = "applicaction/json", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> restProducts(@RequestParam(value = "userId") String userId) throws Exception {
        final ProductsService service = new ProductsService();

        List<Value> list = service.getProductsWithRestTemplate(userId);
        Products products = new Products();
        final List<Products> prodList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            products.setPrice(list.get(i).getUnit_Price());
            products.setDesciption(list.get(i).getItem_Description());
            products.setCategory(list.get(i).getProduct_Class());
            products.setItemcode(list.get(i).getItemCode());
            products.setRoute(list.get(i).getRouteCode());
            products.setUnitofmeasure(list.get(i).getUnitOfMeasureCode());

            prodList.add(products);
        }

        if (prodList.size() == 0) {
            return new ResponseEntity<>(ErrorUtils.notFound(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(prodList.toString(), HttpStatus.OK);
    }
}
