import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka dasar: ");
            double base = scanner.nextDouble();

            System.out.print("Masukkan eksponen (bilangan bulat non-negatif): ");
            int exponent = scanner.nextInt();

            if (exponent < 0) {
                System.out.println("Eksponen harus bilangan bulat non-negatif.");
            } else {
                System.out.println(base + " pangkat " + exponent + " adalah " + calculatePower(base, exponent));
            }
        }
    }

    private static double calculatePower(double base, int exponent) {
        double result = 1;
        while (exponent > 0) {
            result *= base;
            exponent--;
        }
        return result;
    }
}
