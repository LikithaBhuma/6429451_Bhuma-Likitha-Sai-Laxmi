package Projects;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {
    public static void main(String[] args) {
        // Create HttpClient instance
        HttpClient client = HttpClient.newHttpClient();

        // Define request (fetch user data from GitHub API)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/users/octocat")) // Replace with any GitHub username
                .GET()
                .build();

        try {
            // Send request and get response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print response status and body
            System.out.println("Response Status: " + response.statusCode());
            System.out.println("Response Body: " + response.body());

        } catch (Exception e) {
            System.out.println("Error fetching data: " + e.getMessage());
        }
    }
}
