import lombok.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Response getForecast(String zipCode) {
        String url = "http://api.openweathermap.org/data/2.5/weather?zip=" +
                zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Response.class);
    }