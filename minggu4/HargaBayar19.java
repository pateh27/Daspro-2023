package minggu4;

import java.util.Scanner;

public class HargaBayar19 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int harga, jumlah, jumlahHalBuku;
        double dis, total, bayar, jmlDis;
        String MerkBuku = "Vision";

        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan Halaman Buku");
        jumlahHalBuku=input.nextInt();
        System.out.println("Merk Buku");
        MerkBuku = input.next();
        System.out.println("Masukkan Diskon");
        dis = input.nextDouble();

        
        
        
        total=harga*jumlah;

        jmlDis=total*dis;

        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
        
    }
}
