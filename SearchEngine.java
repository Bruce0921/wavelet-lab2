import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
        // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    String str = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            // path is whatever after the domain usually .com, and before the "?" for query
            // "/" is the base case and the default for the website.
            return String.format("String: %d", str);
        } else if (url.getPath().equals("/increment")) {
            //
            return String.format("Number incremented!");
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("="); // Query starts at the ? question mark
                
                if (parameters[0].equals("search")) {
                    str += parameters[1];
                    return String.format("Number increased by %s! It's now %d", parameters[1], num);
                }
            }
            return "404 Not Found!";
        }
    }

}
public class SearchEngine {
    
}
