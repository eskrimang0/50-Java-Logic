import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka integer: ");
            int angka = scanner.nextInt();

            int sum = calculateSumOfDigits(angka);
            System.out.printf("Sum dari angka %d adalah %d%n", angka, sum);
        }
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; 
            num /= 10;      
        }
        return sum;
    }
}