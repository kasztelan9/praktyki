import java.util.Scanner;

public class napisRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj napis do odwrocenia:");
        String tekst = scanner.nextLine();

        String odwrocony = "";
        for (int i = tekst.length() -1; i >= 0; i--) {
            odwrocony += tekst.charAt(i);
        }

        System.out.println("Oryginał: " + tekst);
        System.out.println("Odwrocony: " + odwrocony);

        scanner.close();
    }
}
