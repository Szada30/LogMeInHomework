package store.actors.data;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import store.actors.data.support.DataReader;

import java.io.FileReader;
import java.io.IOException;

public class AddressInfo {

    private String firstName;
    private String lastName;
    private String address1;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String mobilePhone;

    public AddressInfo(String dataPath) {
        JSONObject data = new DataReader().readDataFile(dataPath);

        this.firstName = (String) data.get("firstName");
        this.lastName = (String) data.get("lastName");
        this.address1 = (String) data.get("address1");
        this.city = (String) data.get("city");
        this.state = (String) data.get("state");
        this.postalCode = (String) data.get("postalCode");
        this.country = (String) data.get("country");
        this.mobilePhone = (String) data.get("mobilePhone");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
}
