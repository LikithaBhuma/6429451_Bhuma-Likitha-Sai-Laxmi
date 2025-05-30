package Projects;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class HttpClientExample {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/octocat")) 
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response Status: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        } catch (Exception e) {
            System.out.println("Error fetching data: " + e.getMessage());
        }
    }
}
