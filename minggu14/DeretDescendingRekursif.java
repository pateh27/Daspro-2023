package minggu14;

import java.util.Scanner;

public class DeretDescendingRekursif {
    static void DeretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.println(" ");
            DeretDescendingRekursif( n - 1);
        }
    }
    static void DeretDescendingiteratif ( int n) {
        for (int i = n; i >= 0; i-- ) {
            System.out.println(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println();

        System.out.println("Deret Descending Iteratif: ");
        DeretDescendingiteratif(n);
        sc.close();
    }
}
