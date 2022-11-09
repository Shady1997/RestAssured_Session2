package getRequest_NonBDD;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Non_BDD
{
    public static void main(String[] args) {

//        // Send Request using Non-BDD
//        RestAssured.baseURI="https://reqres.in/api/users/2";
//
//        RequestSpecification request =RestAssured.given();
//
//        Response response=request.get();
//
//        // printing response body
//        response.prettyPrint();
//        // send request using BDD
//        Response response=RestAssured.given().baseUri("https://reqres.in/api/users/2").when().get();
//        response.prettyPrint();

//        // Send request with query parameter
//        RestAssured.baseURI="https://reqres.in/api/users";
//
//        RequestSpecification requestSpecification=RestAssured.given();
//
//        Map queryParameters = new HashMap();
//
//        queryParameters.put("page","3");
//
//        requestSpecification.queryParam("page","2");
//
//        Response response=requestSpecification.get();
//
//        response.prettyPrint();
//
//        Response response1=RestAssured.given().baseUri("https://reqres.in/api/users").queryParams(queryParameters).when().get();
//        response1.prettyPrint();

        // send put method
        RestAssured.baseURI="https://reqres.in/api/users/2";

        RequestSpecification requestSpecification=RestAssured.given();

        requestSpecification.header("Content-Type","Application/Json");

        requestSpecification.body("{\"name\":\"shady\",\"job\":\"Engineer\"}");

        Response response=requestSpecification.put();

        response.prettyPrint();

        // extract data from body
        JsonPath path=response.jsonPath();
        String updatedAt=path.getString("updatedAt");
        System.out.println(updatedAt);



    }
}
