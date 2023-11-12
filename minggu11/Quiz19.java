package minggu11;
import java.util.Scanner;
import java.util.Random;
public class Quiz19 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu ='y';
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.println("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer > number) {
                    System.out.println("Lebih kecil dari ");
                } else if (answer < number) {
                    System.out.println("Lebih besar dari ");
                }
                success = (answer==number);
            } while (!success);
            System.out.println("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        } while (menu=='y' || menu=='Y');
        System.out.println("Terima kasih sudah bermain");
    }
}
