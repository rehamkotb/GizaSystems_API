package com.gizasystems.tests;

import com.gizasystems.base.TestBase;
import com.gizasystems.endpoints.PetEndpoints;
import com.gizasystems.utilities.ExtentReportManager;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class getPet extends TestBase {
    @Test
    public void testGetPetById() {
        test = extent.createTest("Test Get Pet by ID");
        int petId = 66;
        Response response = PetEndpoints.getPetById(petId);
        test.info("Sending GET request for pet with ID: " + petId);
        test.info("Received Response: " + response.asPrettyString());
        test.info("Response Status Code: " + response.getStatusCode());


        String petName = response.jsonPath().getString("name");
        System.out.println("Pet Name: " + petName);
        Assert.assertNotNull(petName, "Pet name should not be null");
        test.pass("Pet is retrieved with Name: " + petName);

    }
}
