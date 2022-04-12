package com.epam.training.student_iulia_iasoveeva.api_training;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TrainingApiTests {


    private static final String URI = "https://httpbin.org/%s";


    @Test
    public void postBodyContains() {
        String endpoint = String.format(URI, "post");
        var response = given().when().post(endpoint)
                .then()
                .assertThat().statusCode(200)
                .body("url", containsString(endpoint));
        //        -- uncomment to see response in terminal
        response.log().body();
    }

    @Test
    public void getContentTypeCheck() {
        String endpoint = String.format(URI, "encoding/utf8");
        var response = given().when().get(endpoint)
                .then()
                .assertThat().statusCode(200)
                .assertThat().contentType("text/html");
//         -- uncomment to see response in terminal
        response.log().body();
    }

    @Test
    public void getContentHasText() {
        String endpoint = String.format(URI, "deny");
        var response = given().when().get(endpoint)
                .then()
                .assertThat().statusCode(200)
                .assertThat().body(containsStringIgnoringCase("YOU SHOULDN'T BE HERE"));
        response.log().body();

    }
    // check url /deny
    // assert that body contains "YOU SHOULDN'T BE HERE"

    @Test
    public void getContentHeaders(){
        String endpoint = String.format(URI,"response-headers?freeform=header1%2C%20header2");
        var response = given().when().get(endpoint)
                .then().assertThat().statusCode(200)
                .header("freeform",equalTo("header1%2C%20header2"));
        response.log().body();
    }

    // check url /response-headers?freeform=header1%2C%20header2
    // asset that headers contains "header1" and "header2"


    @Test
    public void getContentHasCookie(){
        String endpoint = String.format(URI,"cookies/set/name1/value1");
        var response = given().when().get(endpoint)
                .then().assertThat().statusCode(200);
               // .cookie("freeform", hasValue("cookie1"));
              //  .body("cookies",);
        response.log().body();

    }

    // check the url /set?freeform=cookie1
    // assert that body contains cookie "freeform": "cookie1"

}
