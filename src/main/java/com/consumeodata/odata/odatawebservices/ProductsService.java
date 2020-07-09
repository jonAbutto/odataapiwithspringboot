package com.consumeodata.odata.odatawebservices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.consumeodata.odata.models.Value;
import com.consumeodata.odata.odatawebservices.utils.ErrorUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ProductsService {

    // ODATA FOR PRODUCTS

    private static final String ODATA_BASE_URL = "your base url";

    public String getProductsWithOkHttp(final String userId) throws IOException {

        final String BASE_URL =ODATA_BASE_URL + "QryProductsList?$count=true&$filter=Customer_No eq '"
                + userId + "'";
        final OkHttpClient client = new OkHttpClient();

        final Request request = new Request.Builder().addHeader("Authorization", "Basic Sk9ITjpKb2huQDIwMTk=")
                .url(BASE_URL).header("content-type", "application/json").build();

        // final Call call = client.newCall(request);
        Response response = null;

        response = client.newCall(request).execute();
        // System.out.print(response.body().string());

        // use Json to get the desired node > > > value node
        final String jsonString = response.body().string();

        if (response.isSuccessful()) {

            final ObjectMapper mapper = new ObjectMapper();
            final JsonNode node = mapper.readTree(jsonString);
            final JsonNode node2 = node.get("value");

            final List<Value> list = mapper.readValue(node2.toString(), new TypeReference<List<Value>>() {
            });

            return list.toString();
            // response.body().close();

        } else

            return ErrorUtils.notFound();

    }

    public List<Value> getProductsWithRestTemplate(final String userId) throws JsonProcessingException, Exception {
        final RestTemplate template = new RestTemplate();
         String url = ODATA_BASE_URL + "QryProductsList?$count=true&$filter=Customer_No eq '"
                + userId + "'";

        // encrypt password to base 64 string
        final String plainCreds = "name:password";
        final byte[] getPlainCredsBytes = plainCreds.getBytes();
        final byte[] base64Creds = org.apache.tomcat.util.codec.binary.Base64.encodeBase64(getPlainCredsBytes);
        final String encodedCreds = new String(base64Creds);

        // add creds to auth headers
        final HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " +encodedCreds);
        headers.add("content-type", "application/json");
        // get http req and response
        final HttpEntity<String> requEntity = new HttpEntity<String>(headers);

        final ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, requEntity, String.class);

        final String stringResponse = response.getBody();

        if (response.getStatusCode() == HttpStatus.OK) {

            final ObjectMapper mapper = new ObjectMapper();
            // mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

            final JsonNode node = mapper.readTree(stringResponse);
            final JsonNode node2 = node.get("value");

            final List<Value> list = mapper.readValue(node2.toString(), new TypeReference<List<Value>>() {
            });

            return list;
        } else
            return new ArrayList<>();

    }

}