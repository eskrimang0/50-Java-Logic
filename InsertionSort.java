import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah angka: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Jumlah angka harus lebih dari 0.");
                return;
            }

            int[] array = new int[n];
            System.out.println("Masukkan " + n + " angka:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            insertionSort(array);

            System.out.println("Array terurut (ASC): " + Arrays.toString(array));
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
