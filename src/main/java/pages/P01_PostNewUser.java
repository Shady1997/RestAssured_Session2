package pages;

import org.json.simple.JSONObject;

public class P01_PostNewUser {

    // format this json {"id":0,"name":"Shady"}
    private int id;
    private String name;
    private JSONObject object=new JSONObject();
    public P01_PostNewUser setId(int id) {
        this.id = id;
        return this;
    }

    public P01_PostNewUser setName(String name) {
        this.name = name;
        return this;
    }

    private void setObjectBody(){
        object.put("id",id);
        object.put("name",name);
    }
    public JSONObject getBody(){
        setObjectBody();
        return object;
    }



}
