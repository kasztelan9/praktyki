import java.util.Scanner;

public class SumaDoN {
    public static void main(Scanner[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dodatnią liczbę N: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("Suma liczb od 1 do " + n +  "wynosi: " + suma);

        scanner.close();
    }
}
