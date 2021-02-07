package store.actors.data.support;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class DataReader {

    public JSONObject readDataFile(String dataPath) {
        JSONParser jsonParser = new JSONParser();

        try {
            Object data = jsonParser.parse(new FileReader(dataPath));

            return (JSONObject) data;

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new NullPointerException();
    }
}
