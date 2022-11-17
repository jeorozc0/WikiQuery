import com.jayway.jsonpath.JsonPath;
import java.io.IOException;
import java.util.ArrayList;

public class Article {
    Wikipedia wiki = new Wikipedia();

    public ArrayList<String> parseRevisions(String article) throws IOException {
        article = wiki.grabWikipediaJSON(article);
        return JsonPath.read(article, "$..revisions[*].user");
    }

}
