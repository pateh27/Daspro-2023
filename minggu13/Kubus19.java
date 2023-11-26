package minggu13;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit;
public class Kubus19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sisi, v, per;
        System.out.println("Masukkan sisi : ");
        sisi=sc.nextInt();

        v = hitungVolume(sisi);
        per = hitungPermukaan(sisi);
        System.out.println("Besar volume : "+v);
        System.out.println("Besaran permukaan : "+per);
    }
    static int hitungVolume(int a){
        int vol = a*a*a;
        return vol;
    }
    static int hitungPermukaan(int b){
        int permukaan = 6* (b*b);
        return permukaan;
    }
}