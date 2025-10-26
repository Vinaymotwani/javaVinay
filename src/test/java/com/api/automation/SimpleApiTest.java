package com.api.automation;  // <-- FIX 1: Package must match folder

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

// FIX 2: Class name must match file name
public class SimpleApiTest { 
    
    // A simple, reliable API test using REST-Assured
    @Test
    public void verifyGitHubStatusIs200() {
        given()
        .when()
            .get("https://api.github.com/users/octocat")
        .then()
            .statusCode(200); // Asserts the response code is 200 (Success)
    }

    // You can add more tests here, like a failure example
    @Test
    public void verifyInvalidEndpointStatusIs404() {
        given()
        .when()
            .get("https://api.github.com/nonexistent")
        .then()
            .statusCode(404); // Asserts the response code is 404 (Not Found)
    }
}