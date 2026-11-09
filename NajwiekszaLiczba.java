public class NajwiekszaLiczba {
    public static void main(String[] args) {
        int[] liczby = {13, 45, 7, 89, 23, 56, 3};

        int max = liczby[0];

        for (int i = 1; i < liczby.length; i++) {
            if (liczby [i] > max) {
                max = liczby[i];
            }
        }

        System.out.println("Największa liczba w tablicy to: " + max);
    }

}
