package minggu6;
import java.util.Scanner;

public class Individu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisBuku;
        int jmlBuku, diskon;

        System.out.println("Masukkan Jenis Buku : ");
        jenisBuku = input.nextLine();
        System.out.println("Masukkan Jumlah Buku : ");
        jmlBuku = input.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jmlBuku > 2) {
                diskon = 12;
            } else {
                diskon = 10;
            }
        }else if (jenisBuku.equalsIgnoreCase("novel")){
           if (jmlBuku > 3) {
                diskon = 9;
           } else {
            diskon = 8;
           }
        } else if (jmlBuku > 3) {
            diskon = 5;
        } else {
            diskon = 0;
        }
    }
}
