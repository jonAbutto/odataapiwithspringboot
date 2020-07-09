package com.consumeodata.odata.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    @JsonProperty(value = "UnitOfMeasureCode")
    private String UnitOfMeasureCode;
    @JsonProperty(value = "ItemCode")
    private String ItemCode;
    @JsonProperty(value = "Item_Description")
    private String Item_Description;
    @JsonProperty(value = "Product_Class")
    private String Product_Class;
    @JsonProperty(value = "Customer_No")
    private String Customer_No;
    @JsonProperty(value = "RouteCode")
    private String RouteCode;
    @JsonProperty(value = "Unit_Price")
    private String Unit_Price;
    @JsonProperty(value = "AuxiliaryIndex1")
    private String AuxiliaryIndex1;
    @JsonProperty(value = "AuxiliaryIndex2")
    private String AuxiliaryIndex2;
    @JsonProperty(value = "AuxiliaryIndex3")
    private String AuxiliaryIndex3;


    public Value() {
    }

    public String getUnitOfMeasureCode() {
        return this.UnitOfMeasureCode;
    }

    public void setUnitOfMeasureCode(String UnitOfMeasureCode) {
        this.UnitOfMeasureCode = UnitOfMeasureCode;
    }

    public String getItemCode() {
        return this.ItemCode;
    }

    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    public String getItem_Description() {
        return this.Item_Description;
    }

    public void setItem_Description(String Item_Description) {
        this.Item_Description = Item_Description;
    }

    public String getProduct_Class() {
        return this.Product_Class;
    }

    public void setProduct_Class(String Product_Class) {
        this.Product_Class = Product_Class;
    }

    public String getCustomer_No() {
        return this.Customer_No;
    }

    public void setCustomer_No(String Customer_No) {
        this.Customer_No = Customer_No;
    }

    public String getRouteCode() {
        return this.RouteCode;
    }

    public void setRouteCode(String RouteCode) {
        this.RouteCode = RouteCode;
    }

    public String getUnit_Price() {
        return this.Unit_Price;
    }

    public void setUnit_Price(String Unit_Price) {
        this.Unit_Price = Unit_Price;
    }

    public String getAuxiliaryIndex1() {
        return this.AuxiliaryIndex1;
    }

    public void setAuxiliaryIndex1(String AuxiliaryIndex1) {
        this.AuxiliaryIndex1 = AuxiliaryIndex1;
    }

    public String getAuxiliaryIndex2() {
        return this.AuxiliaryIndex2;
    }

    public void setAuxiliaryIndex2(String AuxiliaryIndex2) {
        this.AuxiliaryIndex2 = AuxiliaryIndex2;
    }

    public String getAuxiliaryIndex3() {
        return this.AuxiliaryIndex3;
    }

    public void setAuxiliaryIndex3(String AuxiliaryIndex3) {
        this.AuxiliaryIndex3 = AuxiliaryIndex3;
    }

    @Override
    public String toString() {
        return "{" +
            " UnitOfMeasureCode='" + getUnitOfMeasureCode() + "'" +
            ", ItemCode='" + getItemCode() + "'" +
            ", Item_Description='" + getItem_Description() + "'" +
            ", Product_Class='" + getProduct_Class() + "'" +
            ", Customer_No='" + getCustomer_No() + "'" +
            ", RouteCode='" + getRouteCode() + "'" +
            ", Unit_Price='" + getUnit_Price() + "'" +
            ", AuxiliaryIndex1='" + getAuxiliaryIndex1() + "'" +
            ", AuxiliaryIndex2='" + getAuxiliaryIndex2() + "'" +
            ", AuxiliaryIndex3='" + getAuxiliaryIndex3() + "'" +
            "}";
    }

}