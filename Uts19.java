import java.util.Scanner;

public class Uts19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        
        System.out.println("Masukkan sudut 1 : ");
        int sudut1 = sc.nextInt();
        System.out.println("Masukkan sudut 2 : ");
        int sudut2 = sc.nextInt();
        System.out.println("Masukkan sudut 3 : ");
        int sudut3 = sc.nextInt();

        double totsudut = sudut1 + sudut2 + sudut3;

       if (totsudut == 180) {
        if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
            if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3));
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        }else 
            System.out.println("Segitga tersebut bukan segitiga siku-siku");
       }else
        System.out.println("Input nilai tidak sesuai");
    }
}

