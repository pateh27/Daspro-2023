package minggu9;

import java.util.Scanner;

public class ArrayrataNilai19 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa : ");
    int jumlahMhs = sc.nextInt();

    int[] nilaiMhs = new int[jumlahMhs];
    double totalLulus = 0;
    double tdkLulus = 0;
    int jmlLulus = 0;
    int jmlTdkLulus = 0;
    double total = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
      nilaiMhs[i] = sc.nextInt();
      if (nilaiMhs[i] > 70) {
        totalLulus += nilaiMhs[i];
        jmlLulus++;
      } else {
        tdkLulus += nilaiMhs[i];
        jmlTdkLulus++;
      }
    }
    for (int i = 0; i < nilaiMhs.length; i++) {
      total += nilaiMhs[i];
    }

    double ratalulus = (jmlLulus > 0) ? totalLulus / jmlLulus : 0;
    double rataTdkLulus = (jmlTdkLulus > 0) ? tdkLulus / jmlTdkLulus : 0;

    System.out.println("Rata-rata nilai lulus = " + ratalulus);
    System.out.println("Ratta-rata nilai tidak lulus = " + rataTdkLulus);
  }
}
