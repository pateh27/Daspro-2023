package minggu6;
import java.util.Scanner;

public class Pemilihan2Percobaan219 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        float sudut1,sudut2,sudut3,totsudut;
        
        System.out.println("Masukkan sudut pertama  : ");
        sudut1 = input19.nextFloat();
        System.out.println("Masukkan sudut kedua    : ");
        sudut2 = input19.nextFloat();
        System.out.println("Masukkan sudut ketiga   : ");
        sudut3 = input19.nextFloat();

        totsudut = sudut1 + sudut2 + sudut3;

        if (totsudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else 
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else 
            System.out.println("Bukan segitga"); 
         
    }
}
