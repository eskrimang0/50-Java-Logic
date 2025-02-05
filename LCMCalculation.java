import java.util.Scanner;

public class LCMCalculation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();

            int lcm = calculateLCM(angka1, angka2);
            System.out.printf("Angka PPCM dari %d dan %d adalah %d%n", angka1, angka2, lcm);
        }
    }

    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
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