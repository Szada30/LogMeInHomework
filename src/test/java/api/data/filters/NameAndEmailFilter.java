package api.data.filters;

import api.data.types.NameAndEmail;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Map;

public class NameAndEmailFilter{

    private JSONArray json;

    public NameAndEmailFilter(JSONArray json) {
        this.json = json;
    }
    public ArrayList<NameAndEmail> filterData() {
        ArrayList<NameAndEmail> filteredList = new ArrayList<NameAndEmail>();

        for(int i = 0; i < this.json.size(); i++) {
            JSONObject o = new JSONObject((Map)this.json.get(i));
            filteredList.add(new NameAndEmail((String)o.get("name"), (String)o.get("email")));
        }

        return filteredList;
    }
}
