package store.requests;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class LogoutRequest extends BasicRequest{

    private static final String URL = BasicRequest.BASE_URL + "?controller=authentication&back=my-account";
    HttpGet request;

    public LogoutRequest()
    {
        this.request = new HttpGet(LogoutRequest.URL);
    }


    @Override
    public void sendRequest() throws IOException {
        System.out.println("Initiating Logout Request on: " + LogoutRequest.URL);
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(this.request)) {

            System.out.println(response.getStatusLine().getStatusCode());
            System.out.println(response.getStatusLine().getReasonPhrase());
        }
    }
}
