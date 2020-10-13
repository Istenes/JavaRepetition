import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxNumber;
        int numberOfTries;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange max tal: ");
        maxNumber = scanner.nextInt();

        System.out.print("Ange max gissningar: ");
        numberOfTries = scanner.nextInt();

        Random random = new Random();
        // Add 1 to make it between 1 and maxNumber
        int correctNumber = random.nextInt(maxNumber) + 1;
        System.out.printf("(correctNumber: %d)\n", correctNumber);

        for (int guessCount = 1; guessCount <= numberOfTries; guessCount++) {
            System.out.printf("Gissa en siffra mellan 1 och %d: ", maxNumber);
            int number = scanner.nextInt();
            if (number == correctNumber) {
                // Användaren har gissat rätt
                System.out.printf("Grattis du gissade rätt! Du klarade det på %d försök", guessCount);
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
