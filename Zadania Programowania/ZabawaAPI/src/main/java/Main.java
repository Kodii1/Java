import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ParseException {
        String city = "Gdańsk";
        API api = new API(city);
        api.getInformation();

    }

}