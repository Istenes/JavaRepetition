import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxNumber = 50;
        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber);
        System.out.println(randomNumber);
        boolean wrong = true;
        Scanner scanner = new Scanner(System.in);

        int numberOfTries = 3;
        for (int guessCount = 1; guessCount <= numberOfTries; guessCount++) {
            System.out.printf("Gissa en siffra mellan 0 och %d: ", maxNumber);
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("Grattis du gissade rätt!");
            } else {
                System.out.println("Tyvärr du gissade fel :(");
            }
        }
    }

}
