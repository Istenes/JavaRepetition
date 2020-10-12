import java.util.Random;
import java.util.Scanner;

public class GuessNumberMM {
    public static void main(String[] args) {
        int maxNumber = 5;

        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber);
        System.out.println("Max tal: " +maxNumber);
        System.out.println("Random: " +randomNumber);

        System.out.printf("Gissa siffran (0-%d): ", maxNumber);
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == randomNumber) {
            System.out.println("Du har gissat siffran!");
        } else {
            System.out.println("Tyvärr har du inte gissat siffran!");
            System.out.printf("Din var %d och den att gissa var %d.", number, randomNumber);
        }
    }
}
