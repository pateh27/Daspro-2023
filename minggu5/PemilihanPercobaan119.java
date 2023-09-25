package minggu5;
import java.util.Scanner;
public class PemilihanPercobaan119 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input19.nextInt();

        System.out.println("Angka "+angka+ " bilangan " +(angka%2 == 0 ? " genap " : " ganjil "));
            
    }
}
