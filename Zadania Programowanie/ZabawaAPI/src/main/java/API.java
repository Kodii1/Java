import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class API {
    // API KEY = c42c4a7f5ad849bfa19224445230412 <-- The key may have expired new one for free on website :https://www.weatherapi.com
    // JSON: https://api.weatherapi.com/v1/current.json?key=<API_KEY>=<CITY>
    private String city;
    private static final String API_KEY = "c42c4a7f5ad849bfa19224445230412";
    private final JSONObject jsonObject;
    public API(String city) throws IOException, InterruptedException {
        this.city = city;
        this.jsonObject = callAPI();
    }
    private JSONObject callAPI() throws IOException, InterruptedException {
        URI uri = URI.create("https://api.weatherapi.com/v1/current.json?key=" + API_KEY + "&q=" + city);
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(uri).build();
        HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());

        int responseCode = response.statusCode();

        if (200 != responseCode) {
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        } else {
            try (Scanner scanner = new Scanner(response.body())) {
                StringBuilder informationString = new StringBuilder();
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }

                JSONParser parse = new JSONParser();
                JSONObject jsonObject = (JSONObject) parse.parse(informationString.toString());
                return (JSONObject) jsonObject.get("current");
            } catch (ParseException e) {
                throw new RuntimeException("Error JSON scanner input", e);
            }
        }
    }
    public void getInformation(){
        System.out.println("Last update: " + jsonObject.get("last_updated"));
        System.out.println("Temperature (C): " + jsonObject.get("temp_c"));
        System.out.println("Sensed temperature (C): " + jsonObject.get("feelsLike_c"));
        System.out.println("Wind speed (km/h): " + jsonObject.get("wind_kph"));
        System.out.println("Wind direction: " + jsonObject.get("wind_dir"));
    }
}

