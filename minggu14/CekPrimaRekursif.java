package minggu14;
import java.util.Scanner;
public class CekPrimaRekursif {
    static boolean cekPrimaRekursif(int x, int y) {
        if(y == 1) {
            return true;
        } else {
            if (x % y == 0) {
                return false;
            } else {
                return cekPrimaRekursif(x, y - 1);
            }
        }  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai x: ");
        int x = sc.nextInt();
        boolean hasil = cekPrimaRekursif(x, x-1);

        if (hasil) {
            System.out.print(x + " adalah bilangan prima.");
        } else {
            System.out.print(x + " bukan bilangan prima.");
        }
        sc.close();
    }
}