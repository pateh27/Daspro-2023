package minggu5;

import java.util.Scanner;

public class PemilihanPercobaan219 {
    public static void main(String[] args) {
        java.util.Scanner input19 = new Scanner(System.in);

        System.out.print("Nilai Uas       : ");
        float uas = input19.nextFloat();
        System.out.print("Nilai uts       : ");
        float uts = input19.nextFloat();
        System.out.print("Nilai kuis      : ");
        float kuis = input19.nextFloat();
        System.out.print("Nilai tugas     : ");
        float tugas = input19.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        System.out.println(total);

        if (total >= 80 && total <= 100) {
            System.out.println("Nilai huruf     : A");
            System.out.println("Nilai setara    : 4");
            System.out.println("Kategori nilai  : Sangat Baik");
        }
        else if (total >= 73 && total <= 80) {
            System.out.println("Nilai huruf     : B+");
            System.out.println("Nilai setara    : 3.5");
            System.out.println("Kategori nilai  : Lebih dari Baik");
        }
        else if (total >= 65 && total <= 73) {
            System.out.println("Nilai huruf     : B");
            System.out.println("Nilai setara    : 3");
            System.out.println("Kategori nilai  : Baik");
        }
        else if (total >= 60 && total <= 65) {
            System.out.println("Nilai huruf     : C+");
            System.out.println("Nilai setara    : 2,5");
            System.out.println("Kategori nilai  : Lebih dari Cukup");
        }
        else if (total >= 50 && total <= 60) {
            System.out.println("Nilai huruf     : C");
            System.out.println("Nilai setara    : 2");
            System.out.println("Kategori nilai  : Cukup");
        }
        else if (total >= 39 && total <= 50) {
            System.out.println("Nilai huruf     : D");
            System.out.println("Nilai setara    : 1");
            System.out.println("Kategori nilai  : Kurang");
        }
        else {
            System.out.println("Nilai huruf     : E");
            System.out.println("Nilai setara    : 0");
            System.out.println("Kategori nilai  : Gagal");
        } 
    }
}
