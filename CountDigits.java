import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka integer: ");
            int angka = scanner.nextInt();

            int hitung = countDigits(angka);
            System.out.printf("Angka %d mengandung %d digit.%n", angka, hitung);
        }
    }

    public static int countDigits(int num) {
        int hitung = 0;
        while (num != 0) {
            hitung++;
            num /= 10; 
        }
        return hitung;
    }
}