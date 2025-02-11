package com.gizasystems.endpoints;

import com.gizasystems.ApiBase;
import com.gizasystems.models.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PetEndpoints extends ApiBase {

    public static Response getPetById(int petId) {
        return given()
                .log().all()
                .when()
                .get("/" + petId)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response();
    }


    public static Response findPetsByStatus(String status) {
        return given()
                .log().all()
                .queryParam("status", status)
                .when()
                .get("/findByStatus")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response();
    }


    public static Response createNewPet(Pet pet) {
        return given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(pet)
                .when()
                .post("/")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response();
    }
}


