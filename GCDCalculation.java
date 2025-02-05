import java.util.Scanner;

public class GCDCalculation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();

            int gcd = calculateGCD(angka1, angka2);
            System.out.printf("Angka PGCD dari %d dan %d adalah %d%n", angka1, angka2, gcd);
        }
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}