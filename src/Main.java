import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxNumber = 10;
        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber);
        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        int numberOfTries = 3;
        int guessCount;

        for (guessCount = 1; guessCount <= numberOfTries; guessCount++) {
            System.out.print("\nGissa en siffra mellan 0 och " + maxNumber + " : ");
            int number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("Grattis du gissade rätt!");
                break;
            } else {
                System.out.println("Tyvärr gissade du fel :(");
                if (number > randomNumber) {
                    System.out.println("Du gissade för hogt. Försök " + guessCount);
                } else {
                    System.out.println("Du gissade för lågt. Försök " + guessCount);
                }
            }
        }
    }
}
