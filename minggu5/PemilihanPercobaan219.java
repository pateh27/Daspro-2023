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

        String massage = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " +total+ " sehingga " + massage);
    }
}
