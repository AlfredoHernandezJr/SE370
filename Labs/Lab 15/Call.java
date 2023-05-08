import java.net.URI;
import java.net.http.HttpRequest ;
import java.net.http.HttpResponse ;
import java.net.http.HttpClient ;
import java.io.IOException ;

public class Call {
    public static void main(String[] args) {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://rapidapi.com/rapihub-rapihub-default/api/imdb-top-100-movies"))
                .header("X-RapidAPI-Host", "imdb-top-100-movies.p.rapidapi.com")
                .header("X-RapidAPI-Key", "05c6f85bb3msh07d1a268869c85cp14e79ajsne56cf2cbc5cb")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;

        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(response.body());
    }
}
