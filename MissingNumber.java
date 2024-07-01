public class MissingNumber {

  public static void main(String[] args) {
    int [] arr={1,2,3,5};
    int n=5;
    System.out.println(missingNumber(n,arr));
  }

  public static int missingNumber(int n, int arr[]) {

    int total = n*(n+1)/2;
    int sum=0;
    for(int i=0;i<n-1;i++){
      sum+=arr[i];
    }
    return total - sum;
  }

}
