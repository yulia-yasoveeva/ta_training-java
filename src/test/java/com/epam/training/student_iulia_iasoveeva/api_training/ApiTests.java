package com.epam.training.student_iulia_iasoveeva.api_training;

import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.samePropertyValuesAs;

public class ApiTests {
    @Test
    public void getCategories(){
        String endpoint = "http://localhost:8888/api_testing/category/read.php";
        var response = given().when().get(endpoint).then();
        response.log().body();
    }
    @Test
    public void getProduct(){
        String endpoint = "http://localhost:8888/api_testing/product/read_one.php";
       // var response =
//                given().
//                        queryParam("id", 2)
//                        .when()
//                        .get(endpoint)
//                        .then();
//        response.log().body();
        given()
                .queryParam("id",2)
                .when()
                .get(endpoint)
                .then()
                .assertThat().statusCode(200)
                .body("id", equalTo("2"))
                .body("name", equalTo("Water bottle"));
    }
    @Test
    public void createProduct(){
        String endpoint = "http://localhost:8888/api_testing/product/create.php";
        String body = """
                {"name": "Water bottle",
                "description: "blue water bottle",
                "price" = 12,
                "category_id": 3
                }
                """;
        var response = given().body(body).when().post(endpoint).then();
        response.log().body();
    }
    @Test
    public void updateProducts(){
        String endpoint = "http://localhost:8888/api_testing/product/update.php";
        String body = """
                {"id": 19,
                "name": "Water bottle",
                "description: "blue water bottle",
                "price":15;
                "category_id": 3
                }
                """;
        var response = given().body(body).when().put(endpoint).then();
        response.log().body();
    }
    @Test
    public void deleteProduct(){
        String endpoint = "http://localhost:8888/api_testing/product/delete.php";
        String body = """
                {"id": 19,
                                }
                """;
        var response = given().body(body).when().delete(endpoint).then();
        response.log().body();
    }
    @Test
    public void createSerializedProduct(){
        String endpoint = "http://localhost:8888/api_testing/product/create.php";
        Product product = new Product(
                "Water Bottle",
                "blue water bottle",
                12.0,
                3);
        var response = given().body(product).when().post(endpoint).then();
    }

    @Test
    public void getDeSerializedProduct(){
        String endpoint = "http://localhost:8888/api_testing/product/read_one.php";
        Product expectedProduct = new Product(
                "Cola",
                "Training trank",
                14.0,
                5
        );
        Product actualProduct = given().
                queryParam("category_id","5")
                .when()
                .get(endpoint)
                .as(Product.class);
        assertThat(actualProduct, samePropertyValuesAs(expectedProduct));
    }
}
