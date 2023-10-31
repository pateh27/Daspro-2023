import java.util.Scanner;
  import java.util.Scanner;
public class coratcoret {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi array dua dimensi untuk menyimpan nama penonton
        String[][] penonton = new String[4][2];
        int index = 0;

        // Menggunakan while loop untuk memasukkan nama penonton
        System.out.println("Masukkan nama penonton (ketik 'selesai' untuk mengakhiri):");

        // Loop while untuk memasukkan nama penonton ke dalam array
        while (index < penonton.length) {
            // Meminta input nama penonton
            System.out.print("Nama penonton: ");
            String namaPenonton = scanner.nextLine();

            // Keluar dari loop jika pengguna memasukkan "selesai"
            if (namaPenonton.equalsIgnoreCase("selesai")) {
                break;
            }

            // Memasukkan nama penonton ke dalam array dua dimensi
            penonton[index][0] = "Penonton " + (index + 1);
            penonton[index][1] = namaPenonton;
            index++;
        }

        // Menampilkan daftar penonton
        System.out.println("Daftar Penonton:");
        for (int i = 0; i < index; i++) {
            System.out.println(penonton[i][0] + ": " + penonton[i][1]);
        }

        scanner.close();
    
    }
}




