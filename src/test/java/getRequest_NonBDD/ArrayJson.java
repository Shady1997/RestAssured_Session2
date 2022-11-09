package getRequest_NonBDD;

import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonArray;
import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonObject;
import org.json.simple.JSONObject;

public class ArrayJson {

    public static void main(String[] args) {

        // send request body to remove 3 orders [1500 , 1501 , 1502]
        JsonArray array=new JsonArray();
        array.add(1500);
        array.add(1501);
        array.add(1502);

        JSONObject object=new JSONObject();
        object.put("name","shady");
        object.put("job","engineer");
        object.put("items",array);

        // print json data
        System.out.println(object);
    }
}
