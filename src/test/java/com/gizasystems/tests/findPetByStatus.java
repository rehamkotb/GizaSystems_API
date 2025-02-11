package com.gizasystems.tests;

import com.gizasystems.base.TestBase;
import com.gizasystems.endpoints.PetEndpoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class findPetByStatus extends TestBase {

    @Test
    public void testFindPetsByStatus() {
        test = extent.createTest("Test Find Pets by Status");
        Response response = PetEndpoints.findPetsByStatus("available");
        test.info("Received Response: " + response.asPrettyString());
        test.info("Response Status Code: " + response.getStatusCode());


        String petNames = response.jsonPath().getString("name");
        System.out.println("Available Pets: " + petNames);
        Assert.assertNotNull(petNames, "Pets list should not be empty");
        test.pass("Pets list retrieved successfully.");
    }

}
