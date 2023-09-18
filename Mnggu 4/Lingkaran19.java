

import java.util.Scanner;



public interface Lingkaran19 {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     
     int r;
     double keliling, luas;

     System.out.println("masukkan jari-jari lingkaran: ");
     r=sc.nextInt();

     keliling= 2*3.14*r;
     luas=3.14*r*r;

     System.out.println(keliling);
     System.out.println(luas);

    }
}
