import java.util.Scanner;
public class Uts3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan bilangan bulat N (N > 0): ");
        int N = sc.nextInt();

        if (N > 0) {
            int jumlahDigitGanjil = hitungDigitGanjil(N);
            System.out.println("Jumlah digit ganjil dalam " + N +" adalah " + jumlahDigitGanjil );
        } else {
            System.out.println("Masukkan tidak valid. N harus lebih dari 0");
            }
        }
        static int hitungDigitGanjil(int angka) {
            int jumlah = 0;

            while (angka > 0 ) {
                int digit = angka % 10;
                if (digit % 2 != 0 ) {
                    jumlah++;
                }
                angka /= 10;
            }
        return jumlah;
    }
}
