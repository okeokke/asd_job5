package asd_job5.BruteForceDivideConquer.minggu5;

public class NilaiMahasiswa07 {
  int maxUts(int[] arr, int left, int right){
    if (left==right) {
      return arr[left];
    }
    int mid = (left+right)/2;
    int leftmax=maxUts(arr, left, mid);
    int rightmax=maxUts(arr, mid+1, right);
    return (leftmax > rightmax) ? leftmax : rightmax;
  }

  int minUts(int[] arr, int left, int right){
    if (left==right) {
      return arr[left];
    }
    int mid = (left+right)/2;
    int leftmin=minUts(arr, left, mid);
    int rightmin=minUts(arr, mid+1, right);
    return (leftmin < rightmin) ? leftmin : rightmin;
  }
  
  double avgUas(int[] arr){
    int total=0;
    for (int i = 0; i < arr.length; i++) {
      total+=arr[i];
    }
    return (double) total/arr.length;
  }
}
