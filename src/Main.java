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

        for (int guessCount = 1; guessCount <= numberOfTries; guessCount++) {
            System.out.println("Gissa en siffra mellan 0 och "+maxNumber);
            int number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("Grattis du gissade rätt!");
            } else {
                System.out.println("Tyvärr gissade du fel :(");
                if (number > randomNumber){
                    System.out.printf("Försök nr %d. " , guessCount);
                    System.out.print ("Du gissade för hogt. ");
                }
                else{
                    System.out.printf("Försök nr %d. " , guessCount);
                    System.out.print ("Du gissade för lågt. ");
                }
            }
        }
        System.out.println();
        System.out.printf("Du har försökt %d gånger", numberOfTries);
        System.out.println();
        System.out.println("Exiting....");
    }
}
