

import java.util.Scanner;



public interface Lingkaran19 {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     
     int jariJari;
     double keliling, luas;

     System.out.println("masukkan jari-jari lingkaran: ");
     jariJari=sc.nextInt();

     keliling= 2*3.14*jariJari;
     luas=3.14*jariJari*jariJari;

     System.out.println(keliling);
     System.out.println(luas);

    }
}
