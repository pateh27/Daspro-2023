package minggu7;
import java.util.Scanner;
public class WhileGaji19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt();

        int i = 0;

        while (i<jumlahKaryawan){
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan,Pegawai");
            System.out.print("Masukkan jabatan Karyawan ke- "+(i+1)+": ");
            jabatan = sc.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = sc.nextInt();
        
            if (jabatan.equalsIgnoreCase("direktur")){
            gajiLembur = 0 * jumlahJamLembur;
            }else if (jabatan.equalsIgnoreCase("pegawai")){
            System.out.println("Jabatan invalid");
            continue;
            }else if (jabatan.equalsIgnoreCase("manajer")){
            gajiLembur = 100000 * jumlahJamLembur;
            }else if (jabatan.equalsIgnoreCase("karyawan")){
            gajiLembur = 75000 * jumlahJamLembur;
            }
            totalGajiLembur += gajiLembur;
            i++;
        }   
            System.out.println("Total gaji lembur: "+totalGajiLembur);

    }
    
}