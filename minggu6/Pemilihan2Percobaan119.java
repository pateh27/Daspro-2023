package minggu6;
import java.util.Scanner;

public class Pemilihan2Percobaan119 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        int tahun;
        System.out.println("Masukkan Tahun");
        tahun = input19.nextInt();
        
        if ((tahun % 100) == 0) 
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");    
               else 
                if ((tahun % 400) == 0) 
                    System.out.println("Tahun kabisat");
                else
                    System.out.println("Bukan Tahun kabisat");
            else 
                System.out.println("Bukan tahun kabisat");  
                      
                
    }
             
}
