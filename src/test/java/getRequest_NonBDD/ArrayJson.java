package getRequest_NonBDD;

import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonArray;
import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonObject;
import org.json.simple.JSONObject;
import pages.P01_PostNewUser;
import pages.P02_Put;

import java.util.ArrayList;

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

        // print complex json
        JSONObject object1=new JSONObject();
        JSONObject object2=new JSONObject();
        JSONObject object3=new JSONObject();

        ArrayList<String> photoUrls=new ArrayList<>();
        photoUrls.add("string");

        object2.put("id",0);
        object2.put("name","string");

        object3.put("id",0);
        object3.put("name","string");
        ArrayList<JSONObject> tags=new ArrayList<>();
        tags.add(object3);

        object1.put("id",0);
        object1.put("category",object2);
        object1.put("name","doggie");
        object1.put("photoUrls",photoUrls);
        object1.put("tags",tags);
        object1.put("status","available");
        System.out.println(object1);
        System.out.println(new P01_PostNewUser().setId(0).setName("Shady").getBody());
        System.out.println(new P02_Put().setID(0).setName("Shady").getBody());
    }
}
