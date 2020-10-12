import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxNumber = 5;
        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber);
        System.out.println(randomNumber);
        boolean wrong = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("\nGissa en siffra mellan 0 och %d: ", maxNumber);
            int number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("Grattis du gissade rätt!");
                wrong = false;
            } else {
                System.out.printf("Tyvärr du gissade fel :( rätt siffra var: %d", randomNumber);
            }
        } while (wrong);

    }
}