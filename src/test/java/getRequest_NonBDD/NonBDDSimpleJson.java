package getRequest_NonBDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.Header;
import org.json.simple.JSONObject;

public class NonBDDSimpleJson {
    public static void main(String[] args) {
        // send put method
        RestAssured.baseURI="https://reqres.in/api/users/2";

        RequestSpecification requestSpecification=RestAssured.given();

        requestSpecification.header("Content-Type","Application/Json");

        // create json object
        JSONObject body=new JSONObject();
        body.put("name","shady");
        body.put("job","engineer");

        requestSpecification.body(body.toJSONString());

        Response response=requestSpecification.put();

        response.prettyPrint();
    }
}
