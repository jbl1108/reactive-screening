package com.beumer;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

class ScreenResourceTest {

  @Test
   void testScreenBagEndpoint() {
    given()
            .when().get("/screen")
            .then()
            .statusCode(200)
            .body(is("CLEAR"));
  }

}
