package services;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class SimpleRestAssuredTest {

    /*Given the GET endpoint /accounts/{accountId}
    When I provide PATH PARAM accountId as 13344
    When I call this method
    Then the response code is 200
    And the customerId is 12212
    And the type is SAVINGS*/

    @Test
    public void simpleGetMethodCall() {
        Map<String, String> customHeaders = new HashMap<>();
        customHeaders.put("accept", "application/json");
        customHeaders.put("Content-Type", "application/json");

        RestAssured
                .given().when().with()
                .headers(customHeaders)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter())
                .get("http://parabank.parasoft.com/parabank/services/bank/accounts/{accountId}", 13344)
                .then().statusCode(200);
        //more assertions needed here
    }
}
