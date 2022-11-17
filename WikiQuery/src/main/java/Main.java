import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        Wikipedia wiki = new Wikipedia();
        Article article = new Article();
        String desiredArticle = menu.getArticleURL();
        System.out.println("Revisions: ");
        ArrayList<String> revisions = article.parseRevisions(desiredArticle);
        revisions.forEach(System.out::println);
    }
}
