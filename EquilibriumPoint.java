public class EquilibriumPoint {

  //Result index should be considered from 1.
  public static void main(String[] args) {
    long arr[] = {2, 3, 5, 1, 4};
    int n = 5;

    System.out.println(equilibriumPoint(arr, n));

  }

  public static int equilibriumPoint(long arr[], int n) {

    // Your code here
    long totalSum = 0;
    long rightSum = 0;
    int index = -1;
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      if (arr[1] == 0) {
        return 1;
      } else {
        return -1;
      }

    }
    for (int i = 0; i < n; i++) {
      totalSum += arr[i];
    }

    for (int i = n - 1; i >= 2; i--) {
      long r = arr[i];
      rightSum = rightSum + r;
      long eqPoint = arr[i - 1];
      long leftSum = totalSum - (rightSum + eqPoint);
      if (leftSum == rightSum) {
        index = i;
      }
    }

    return index;
  }
}



