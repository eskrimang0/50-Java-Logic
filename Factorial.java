import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan positif: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Angka harus bilangan bulat dan tidak boleh kurang dari 0.");
            } else {
                long hasil = calculateFactorial(n);
                System.out.println("Faktorial dari " + n + " adalah " + hasil);
            }
        }
    }

    private static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}