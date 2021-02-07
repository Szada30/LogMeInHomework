package store.actors.data;

import org.json.simple.JSONObject;
import store.actors.data.support.DataReader;

import java.io.FileReader;

public class UserInfo {

    private String email;
    private String firstName;
    private String lastName;
    private String password;

    public UserInfo(String email, String dataPath) {
        JSONObject data = new DataReader().readDataFile(dataPath);

        this.email = email;
        this.firstName = (String) data.get("firstName");
        this.lastName = (String) data.get("lastName");
        this.password = (String) data.get("password");
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }
}
