package minggu5;
import java.util.Scanner;
public class PemilihanPercobaan119 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input00.nextInt();

        System.out.println("Angka "+angka+ " bilangan " +(angka%2 == 0 ? " genap " : " ganjil "));
            
    }
}
