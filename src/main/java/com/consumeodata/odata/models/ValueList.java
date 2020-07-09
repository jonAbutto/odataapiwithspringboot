package com.consumeodata.odata.models;

import java.util.ArrayList;
import java.util.List;

public class ValueList {

  private  List<Value> valueList;

    public ValueList() {
        valueList =  new ArrayList<>();
    }

    public List<Value> getValueList() {
        return this.valueList;
    }

    public void setValueList(List<Value> valueList) {
        this.valueList = valueList;
    }


    
}