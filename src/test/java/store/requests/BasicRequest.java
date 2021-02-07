package store.requests;

import java.io.IOException;

public abstract class BasicRequest {
    public static final String BASE_URL = "http://automationpractice.com/index.php";

    public abstract void sendRequest() throws IOException;
}
