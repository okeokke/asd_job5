package asd_job5.minggu5.BruteForceDivideConquer;
import java.util.Scanner;

public class MainFaktorial07Modif {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai : ");
    int nilai = sc.nextInt();


    Faktorial07Modif fk = new Faktorial07Modif();
    System.out.println("Nilai Faktorial "+nilai+" menggunakan BF for loop: "+fk.faktorialBF(nilai));
    System.out.println("Nilai Faktorial "+nilai+" menggunakan BF while loop: "+fk.faktorialBFwhile(nilai));
    System.out.println("Nilai Faktorial "+nilai+" menggunakan BF dowhile loop: "+fk.faktorialBFdowhile(nilai));
    System.out.println("Nilai Faktorial "+nilai+" menggunakan DC : "+fk.faktorialDC(nilai));
    sc.close();
  }

}
