package minggu14;

public class Fibonaci {
    public static int hitungPasanagnMarmut(int bulan) {
        if (bulan == 1 || bulan == 2 ) {
            return 1;
        } else {
            return hitungPasanagnMarmut(bulan-1) + hitungPasanagnMarmut(bulan-2);
        }
    }

    public static void main(String[] args) {
        int bulanKe12 = 12;
        int jumlahPasangan = hitungPasanagnMarmut(bulanKe12);
        System.out.println(bulanKe12);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulanKe12 + ": " + jumlahPasangan);
    }
}
