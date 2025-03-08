package linkedin_java.joke_generator;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws IOException,InterruptedException {
        //create a client
        var client = HttpClient.newHttpClient();


        //create a request
        var request = HttpRequest.newBuilder(
                URI.create("https://icanhazdadjoke.com/"))//https://icanhazdadjoke.com/
                .header("accept","application/json")
                .build();

        //use the client to send a request
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Optional<String> jokeOpt= parseJoke(response.body());
        Optional<Integer> jokeOpt= parseJoke(response.body());
        jokeOpt.ifPresent(System.out::println);
//        System.out.println(response.statusCode());
//        System.out.println(response.body());
    }

   // private static Optional<String> parseJoke(String body) {
   private static Optional<Integer> parseJoke(String body) {
        try{
            Gson gson= new Gson();
            JokeResponse jokeObject= gson.fromJson(body,JokeResponse.class);
            //return Optional.ofNullable(jokeObject.getJoke());
            return Optional.ofNullable(jokeObject.getStatus());
        }
        catch(Exception e){
            System.out.println("Must be out of jokes now");
            return Optional.empty();
        }
    }
}
