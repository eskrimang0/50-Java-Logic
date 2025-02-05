import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah angka: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Jumlah angka harus lebih dari 0.");
                return;
            }

            int[] array = new int[n];
            System.out.println("Masukkan " + n + " angka (urutkan dahulu atau akan diurutkan otomatis):");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            Arrays.sort(array);  // Ensure array is sorted before binary search
            System.out.println("Array setelah diurutkan: " + Arrays.toString(array));

            System.out.print("Masukkan item untuk dicari: ");
            int itemCari = scanner.nextInt();
            int posisi = binarySearch(array, itemCari);

            if (posisi != -1) {
                System.out.println("Item " + itemCari + " ditemukan pada posisi ke-" + posisi + " dalam array.");
            } else {
                System.out.println("Item " + itemCari + " tidak ditemukan.");
            }
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}