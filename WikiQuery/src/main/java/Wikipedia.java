import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Wikipedia {
    private URL parseURL(String desiredArticle) throws MalformedURLException {
        String articleURL = String.format(
                        "https://en.wikipedia.org/w/api.php?action=query&prop=revisions&format=json&rvprop=timestamp%%7Cuser&rvlimit=30&titles=%s&redirects=", desiredArticle)
                .replaceAll("\\s+","%20");
        return new URL(articleURL);
    }

    public String grabWikipediaJSON(String desiredArticle) throws IOException {
        URL articleURL = parseURL(desiredArticle);
        URLConnection connection =  articleURL.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder builder = new StringBuilder();
        String read;
        while ((read = reader.readLine()) != null) {
            builder.append(read);
        }
        return builder.toString();
    }
}
