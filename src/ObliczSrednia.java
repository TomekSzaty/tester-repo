import java.util.Random;
import java.util.Scanner;

public class ObliczSrednia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Z ilu ocen liczysz srednia?: ");
        int amountGradde = scanner.nextInt();
        int[] scores = new int[amountGradde];
        for (int i = 0; i < amountGradde; i++) {
            System.out.println("Wpisz ocene " + (1 + i) + ": ");
            scores[i] = scanner.nextInt();
        }
        System.out.println("Ilosc ocen: " + scores.length + "\nSrednia ocen: " + average(scores.length, scores));
    }

    static float average(int length, int[] array) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        return (float) sum / (float) length;
    }
}

