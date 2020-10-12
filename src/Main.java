import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int maxNumber = 10;
        Random random = new Random();
        int randomNumber = random.nextInt(maxNumber);

        System.out.printf("Gissa en siffra mellan 0 och %d: ", maxNumber);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == randomNumber) {
            System.out.println("Grattis du gissade rätt!");
        } else {
            if (number > randomNumber) {
                System.out.println("Tyvärr du gissade för högt, gissa igen!");
                number = scanner.nextInt();
                if(number == randomNumber) {
                    System.out.println("Grattis du gissade rätt!");
                } else {
                    System.out.printf("Tyvärr du gissade fel, rätt siffra var %d", randomNumber);
                }
            } else {
                System.out.println("Tyvärr du gissade för lågt, gissa igen!");
                number = scanner.nextInt();
                if(number == randomNumber) {
                    System.out.println("Grattis du gissade rätt!");
                } else {
                    System.out.printf("Tyvärr du gissade fel, rätt siffra var %d", randomNumber);
                }
            }
        }

    }

}
