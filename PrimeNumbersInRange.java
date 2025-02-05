import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka minimum: ");
            int minAngka = scanner.nextInt();

            System.out.print("Masukkan angka maksimum: ");
            int makAngka = scanner.nextInt();

            if (minAngka < 2) {
                minAngka = 2;
            }

            System.out.printf("Bilangan prima dari %d hingga %d:%n", minAngka, makAngka);
            hitungBilanganPrima(minAngka, makAngka);
        }
    }

    public static void hitungBilanganPrima(int minAngka, int makAngka) {
        for (int angka = minAngka; angka <= makAngka; angka++) {
            if (bilanganPrima(angka)) {
                System.out.print(angka + " ");
            }
        }
        System.out.println();
    }

    public static boolean bilanganPrima(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true; 
    }
}