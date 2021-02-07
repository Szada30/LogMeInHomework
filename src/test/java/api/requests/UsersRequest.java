package api.requests;

import api.exceptions.NoJsonArrayException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class UsersRequest extends BasicRequest{

    private String fullEndpoint = this.HOST + "/users";
    private HttpGet request;

    public UsersRequest() {
        this.request = new HttpGet(this.fullEndpoint);;
    }

    public JSONArray getUsers() throws NoJsonArrayException {
        System.out.println("Initiating GET Users Request on: " + this.fullEndpoint);

        try (final CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(this.request)) {

            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != 200)
                throw new RuntimeException("Failed with HTTP error code : " + statusCode);

            HttpEntity entity = response.getEntity();
            if (entity == null) {
                System.out.println("No response.");
                throw new NullPointerException();
            }

            return (JSONArray) new JSONParser().parse(EntityUtils.toString(entity));
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new NoJsonArrayException("JSON Array not created!");
    }
}
