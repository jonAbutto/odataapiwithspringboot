package com.consumeodata.odata.odatawebservices.utils;

public class ErrorUtils {
    
    public static String notFound(){

        return "{ \"message\" : \"not found\", \"status\" : 404}".toString();
    }
}