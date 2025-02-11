package com.gizasystems.tests;

import com.gizasystems.base.TestBase;
import com.gizasystems.endpoints.PetEndpoints;
import com.gizasystems.models.Pet;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createNewPet extends TestBase {
    @Test
    public void testCreateNewPet() {
        test = extent.createTest("Test Create New Pet");
        Pet newPet = new Pet(9999, "PetTest", "available");
        test.info("Creating a new pet with ID: " + newPet.getId() + " and Name: " + newPet.getName());

        Response response = PetEndpoints.createNewPet(newPet);
        test.info("Received Response: " + response.asPrettyString());
        test.info("Response Status Code: " + response.getStatusCode());

        String petName = response.jsonPath().getString("name");
        Assert.assertEquals(petName, "PetTest", "Pet name should match");
        test.pass("Pet is created successfully: " + petName);
    }
}
