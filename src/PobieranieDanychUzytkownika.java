import java.util.Scanner;

public class PobieranieDanychUzytkownika {
    public static void main(String[] args) {

        System.out.println("Podaj swoje imie:");
        Scanner scanner = new Scanner(System.in);
        String name  = scanner.nextLine();
        System.out.println("Hej " + name.toUpperCase() + " !");

        System.out.println("Podaj liczbe:");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();
        System.out.println("Kwadrat tej liczby to " + firstNumber * firstNumber + " !");
    }
}
