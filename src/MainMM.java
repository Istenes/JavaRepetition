import java.util.Scanner;

public class MainMM {

    public static void main(String[] args) {
        System.out.print("Ange en siffra: ");
        Scanner scanner = new Scanner(System.in);
        int siffra = scanner.nextInt();

        if (siffra > 5) {
            System.out.printf("Siffran är högre än 5. Din siffra var %d.", siffra);
        } else if (siffra < 5) {
            System.out.printf("Siffran är lägre än 5. Din siffra var %d.", siffra);
        } else {
            System.out.printf("Siffran var precis %d.", siffra);
        }
    }
}
