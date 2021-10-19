import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz imie:");
        String name = scanner.next();


        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.repeat(3));
        }

    }
}
