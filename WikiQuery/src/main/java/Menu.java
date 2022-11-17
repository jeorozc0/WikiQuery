import java.util.Scanner;

public class Menu {
    public String getArticleURL() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which article would you like to search for?");
        return scanner.nextLine();
    }
}
