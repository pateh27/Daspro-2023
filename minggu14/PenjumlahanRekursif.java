package minggu14;
import java.util.Scanner;
public class PenjumlahanRekursif {
    static int penjumlahanRekursif(int n){
        if (n==1) {
            System.out.print(n + " + ");
            return 1;
        } else {
            int hasil = n + penjumlahanRekursif(n-1);
            System.out.print(n + " + ");
            return hasil; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        int hasil = penjumlahanRekursif(n);
        System.out.print(" = " + hasil);
        sc.close();
    }
}
