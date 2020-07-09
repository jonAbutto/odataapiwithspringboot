package com.consumeodata.odata.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductsUrl {
    @JsonProperty(value = "@odata.context")
    private String url;
    @JsonProperty(value = "@odata.count")
    private String count;
    @JsonProperty(value = "value")
    private List<Value> valueList;


    public ProductsUrl() {
    }


    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCount() {
        return this.count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<Value> getValueList() {
        return this.valueList;
    }

    public void setValueList(List<Value> valueList) {
        this.valueList = valueList;
    }

    @Override
    public String toString() {
        return "{" +
            " url='" + getUrl() + "'" +
            ", count='" + getCount() + "'" +
            ", valueList='" + getValueList() + "'" +
            "}";
    }
    
}