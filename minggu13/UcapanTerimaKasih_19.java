package minggu13;

import java.util.Scanner;

public class UcapanTerimaKasih_19 {
    public static String PenerimaUcapan() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"+"you inspired in me a love for learning and made me feel like i could ask you anything.");
    }

    public static void ucapanTambahan(){
        System.out.println("Terima kasih atas segala jasa jasamu");
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
        ucapanTambahan();
    }
}
