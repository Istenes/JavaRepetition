import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int numberOfTries = 0;
        boolean notAllowed = true;
        while (notAllowed) {
            System.out.printf("Ange svårighetsgrad:\n1) Lätt\n2) Medel\n3) Svår\n");
            String difficulty = scanner.next().toLowerCase();
            switch (difficulty) {
                case "1":
                case "lätt":
                case "easy":
                    maxNumber = 5;
                    numberOfTries = 5;
                    notAllowed = false;
                    break;
                case "2":
                case "medel":
                    maxNumber = 10;
                    numberOfTries = 3;
                    notAllowed = false;
                    break;
                case "3":
                case "svår":
                    maxNumber = 20;
                    numberOfTries = 2;
                    notAllowed = false;
                    break;
                default:
                    System.out.printf("Du angav fel värder, försök igen.%n");

            }
        }
        Random random = new Random();
        // Add 1 to make it between 1 and maxNumber
        int correctNumber = random.nextInt(maxNumber) + 1;
        System.out.printf("(correctNumber: %d)\n", correctNumber);

        for (int guessCount = 1; guessCount <= numberOfTries; guessCount++) {
            System.out.printf("Gissa en siffra mellan 1 och %d: ", maxNumber);
            int number = scanner.nextInt();
            if (number == correctNumber) {
                // Användaren har gissat rätt
                System.out.printf("Grattis du gissade rätt! Du klarade det på %d/%d försök", guessCount, numberOfTries);
                return;
            } else if (number < correctNumber) {
                System.out.println("Du gissade för lågt, försök igen!");
            } else if (number > correctNumber) {
                System.out.println("Du gissade för högt, försök igen!");
            }
        }


        // Användaren har förlorat
        System.out.printf("Tyvärr du förlorade, rätt svar var: %d", correctNumber);
    }

}
