package asd_job5.BruteForceDivideConquer.minggu5;

public class MainMahasiswa07 {
  public static void main(String[] args) {
    Mahasiswa07[] mhs = {
      new Mahasiswa07("Ahmad","220101001",2022,78,82),
      new Mahasiswa07("Budi","220101002",2022,85,88),
      new Mahasiswa07("Cindy","220101003",2021,90,87),
      new Mahasiswa07("Dian","220101004",2021,76,79),
      new Mahasiswa07("Eko","220101005",2023,92,95),
      new Mahasiswa07("Fajar","220101006",2020,88,85),
      new Mahasiswa07("Gina","220101007",2023,80,83),
      new Mahasiswa07("Hadi","220101008",2020,82,84),
    };
    
    int uts[] = new int[mhs.length];
    int uas[] = new int[mhs.length];

    for (int i = 0; i < mhs.length; i++) {
      uts[i]=mhs[i].uts;
      uas[i]=mhs[i].uas;
    }

    NilaiMahasiswa07 nm = new NilaiMahasiswa07();
    
    int maxUts=nm.maxUts(uts, 0, uts.length-1);
    int minUts=nm.minUts(uts, 0, uts.length-1);
    double avgUas=nm.avgUas(uas);
    
    System.out.println("Nilai UTS Tertinggi (DC): " + maxUts);
    System.out.println("Nilai UTS Terendah (DC): " + minUts);
    System.out.println("Rata-rata Nilai UAS (BF): " + avgUas);
  }
}
