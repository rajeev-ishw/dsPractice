import java.io.*;
import java.util.*;
import java.lang.*;


public class RainTappingWater {

  public static void main(String[] args) throws IOException {
    int arr[] = {3, 0, 0, 2, 0, 4};
    int n = 6;
    System.out.println(trappingWater(arr, n));
  }


  static long trappingWater(int arr[], int n) {
    int[] lMax = lMax(arr, n);
    int[] rMax = rMax(arr, n);
    long tappedwater = 0;
    for (int i = 0; i < n; i++) {
      tappedwater += Math.min(lMax[i], rMax[i]) - arr[i];
    }
    return tappedwater;
  }

  public static int[] lMax(int arr[], int n) {
    int[] pm = new int[n];
    int lMax = 0;
    for (int i = 0; i < n; i++) {
      lMax = Math.max(lMax, arr[i]);
      pm[i] = lMax;
    }
    return pm;
  }

  public static int[] rMax(int arr[], int n) {
    int[] sm = new int[n];
    int rMax = 0;
    for (int i = n - 1; i >= 0; i--) {
      rMax = Math.max(rMax, arr[i]);
      sm[i] = rMax;
    }
    return sm;
  }
}


