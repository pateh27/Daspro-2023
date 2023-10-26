import java.util.Scanner;
public class Uts2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan bulat N (N > 0) :");
        int N = sc.nextInt();
        

        if (N > 0) {
            int hasil =0;
            for (int i = 1; i <= N; i++) {
                hasil += i * i;    
            }
         System.out.println("Penjumlahan N bilangan kuadrat pertama adalah: " + hasil);   
        }else {
            System.out.println("Masukkan tidak valid. N harus lebih dari 0.");
        }
    }
}
