package com.consumeodata.odata.models;

public class Products {
    
private String price;
private String desciption;
private String route;
private String category;
private String unitofmeasure;
private String itemcode;

    public Products() {
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDesciption() {
        return this.desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getRoute() {
        return this.route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnitofmeasure() {
        return this.unitofmeasure;
    }

    public void setUnitofmeasure(String unitofmeasure) {
        this.unitofmeasure = unitofmeasure;
    }

    public String getItemcode() {
        return this.itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }



    @Override
    public String toString() {
        return "{" +
            " price='" + getPrice() + "'" +
            ", desciption='" + getDesciption() + "'" +
            ", route='" + getRoute() + "'" +
            ", category='" + getCategory() + "'" +
            ", unitofmeasure='" + getUnitofmeasure() + "'" +
            ", itemcode='" + getItemcode() + "'" +
            "}";
    }



}