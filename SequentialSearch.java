import java.util.Scanner;

public class SequentialSearch {
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

            System.out.print("Masukkan angka yang akan dicari: ");
            int itemCari = scanner.nextInt();
            int posisi = sequentialSearch(array, itemCari);

            if (posisi != -1) {
                System.out.println("Item " + itemCari + " ditemukan pada posisi ke-" + posisi + " dalam array.");
            } else {
                System.out.println("Item " + itemCari + " tidak ditemukan dalam array.");
            }
        }
    }

    private static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}