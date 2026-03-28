package asd_job5.minggu5.BruteForceDivideConquer;
import java.util.Scanner;

public class MainFaktorial07 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai : ");
    int nilai = sc.nextInt();


    Faktorial07 fk = new Faktorial07();
    System.out.println("Nilai Faktorial "+nilai+" menggunakan BF : "+fk.faktorialBF(nilai));
    System.out.println("Nilai Faktorial "+nilai+" menggunakan DC : "+fk.faktorialDC(nilai));
    sc.close();
  }

}
