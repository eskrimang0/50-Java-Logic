import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah angka: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Jumlah angka harus lebih dari 0.");
                return;
            }

            int sum = 0;
            System.out.println("Masukkan " + n + " angka satu per satu:");
            
            for (int i = 0; i < n; i++) {
                sum += scanner.nextInt();
            }

            System.out.println("Hasil penjumlahan adalah: " + sum);
        }
    }
}
