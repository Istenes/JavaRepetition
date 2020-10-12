import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ange en siffra: ");
        Scanner scanner = new Scanner(System.in);
        int siffra = scanner.nextInt();
        //System.out.println("Användaren skrev siffran: " + siffra + "!");
        System.out.printf("Användaren skrev siffran: %d!", siffra);
    }

}
