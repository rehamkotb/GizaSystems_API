package com.gizasystems;


import io.restassured.RestAssured;

public class ApiBase {
    protected static final String BASE_URL = "https://petstore.swagger.io/v2/pet";

    static {
        RestAssured.baseURI = BASE_URL;
    }
}

