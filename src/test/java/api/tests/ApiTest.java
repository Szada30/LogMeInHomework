package api.tests;

import api.data.filters.NameAndEmailFilter;
import api.data.types.NameAndEmail;
import api.exceptions.NoJsonArrayException;
import api.requests.UsersRequest;
import org.json.simple.JSONArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ApiTest {

    // REST API testing
    @Test
    public void apiTest() {
        UsersRequest users = new UsersRequest();
        try {
            JSONArray json = users.getUsers();

            ArrayList<NameAndEmail> filteredList = new NameAndEmailFilter(json).filterData();

            for(NameAndEmail o: filteredList)
                System.out.println(o.toString());

            Assert.assertTrue(filteredList.get(0).getEmail().contains("@"));

        } catch (NoJsonArrayException e) {
            throw new RuntimeException(e);
        }
    }
}
