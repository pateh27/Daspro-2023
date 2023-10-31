package minggu10;
import java.util.Scanner;
public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom;
        String nama, next;
      
        String[][] penonton = new String[4][2];
        int index = 0;
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }   
        }   
        System.out.println("Masukkan nama penonton : ");
        while (index < penonton.length) {
            nama = sc.nextLine();

            if (nama.equalsIgnoreCase("n")) {
                break;
            }
            penonton[index][0] = "Penonton " + (index+1);
            penonton[index][1] = nama;
            index++;
        }
        System.out.println("Daftar penonton: ");
        for (int i = 0; i < index; i++){
            System.out.println(penonton[i][0] + ": " + penonton[i][1]);
        } 
    }  
}
