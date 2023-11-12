package minggu11;

import java.util.Scanner;

public class individu119 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal harus 3 atau lebih.");
        } else {
            System.out.println("Segitiga Angka:");

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}




