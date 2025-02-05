import java.util.Scanner;

public class BubbleShorting{

    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);

           try{

            System.out.println("Masukkan jumlah angka:");

            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Jumlah angka harus lebih dari 0.");
                return;
            }
            
            int[] array = new int[n];

            System.out.println("Masukkan angka acak:");

           for(int i = 0; i < n; i++){
                array[i] = scanner.nextInt();
            }

            //Algoritma untuk shorting angka DESC

            for(int i = 0; i < n - 1; i++){
                for(int j = 0; j < n - 1 - i; j++){
                    if(array[j] < array[j + 1]){
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            //end

            System.out.println("Table sorted.");

            for(int i = 0; i < n; i++){
                System.out.println(array[i] + " ");
            }

        } finally {
            scanner.close();
        }

    }
}