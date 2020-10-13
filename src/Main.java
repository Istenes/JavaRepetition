import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxNumber = 10;
        Random random = new Random();
        int correctNumber = random.nextInt(maxNumber);

        int numberOfTries = 3;
        for (int guessCount = 1; guessCount <= numberOfTries; guessCount++) {
            System.out.printf("Gissa en siffra mellan 0 och %d: ", maxNumber);
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == correctNumber) {
                // Användaren har gissat rätt
                System.out.println("Grattis du gissade rätt!");
                return;
            } else if(number < correctNumber) {
                System.out.println("Du gissade för lågt, försök igen!");
            } else if (number > correctNumber) {
                System.out.println("Du gissade för högt, försök igen!");
            }
        }

        // Användaren har förlorat
        System.out.printf("Tyvärr du förlorade, rätt svar var: %d", correctNumber);
    }

}
