package minggu14;
import java.util.Scanner;
public class Percobaan2 {
    static int hitungPangkat(int x, int y){
        if (y == 0) {
            return(1);
        }else {
            return(x * hitungPangkat(x, y-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Bilangan, Pangkat;

        System.out.println("Bilangan yang dihitung: ");
        Bilangan = sc.nextInt();
        System.out.println("Pangkat: ");
        Pangkat = sc.nextInt();

        System.out.println(hitungPangkat(Bilangan, Pangkat));
        sc.close();
    }
}
