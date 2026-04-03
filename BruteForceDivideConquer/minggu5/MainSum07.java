package asd_job5.BruteForceDivideConquer.minggu5;
import java.util.Scanner;

public class MainSum07 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah elemen: ");
    int elemen = sc.nextInt(); sc.nextLine();

    Sum07 sm = new Sum07(elemen);
    for (int i=0; i<elemen; i++) {
      System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
      sm.keuntungan[i]=sc.nextDouble(); sc.nextLine();
    }

    System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
    System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));

    sc.close();
  }

}