package minggu11;
import java.util.Scanner;
import java.util.Random;
public class Quiz19 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char menu ='y';
        do {
            int number = random.nextInt(10) + 1;
            boolean succes = false;
            do {
                System.out.print("Tebak angka(1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();
                succes=(answer == number);
            } while (!succes);
                System.out.println("Apakah anda ingin mengulang permainan (Y/n)?");
                menu = sc.nextLine().charAt(0);
        } while (menu =='y' || menu == 'Y');
    }
}
