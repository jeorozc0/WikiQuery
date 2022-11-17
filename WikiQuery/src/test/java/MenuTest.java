import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MenuTest {

    @Test
    public void testGetArticleURL(){
        Assertions.assertEquals(
                "https://en.wikipedia.org/w/api.php?action=query&prop=revisions&format=xml&rvprop=timestamp%7Cuser&rvlimit=4&titles=frank%20zappa&redirects=",
                getArticleURL());

    }

}
