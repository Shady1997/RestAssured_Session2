package pages;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class P02_Put {

    // format this json body [{"id":0,"name":"Shady"]
    // step1: define body properties
    private int id;
    private String name;
    private JSONObject object=new JSONObject();
    private ArrayList<JSONObject> body=new ArrayList<>();
    // step2: define set methods
    public P02_Put setID(int id){
        this.id=id;
        return this;
    }
    public P02_Put setName(String name){
        this.name=name;
        return this;
    }
    private void setObject(){
        object.put("id",this.id);
        object.put("name",this.name);
    }
    public List<JSONObject> getBody(){
        setObject();
        this.body.add(object);
        return body;
    }
}
