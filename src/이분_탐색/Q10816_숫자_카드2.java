package 이분_탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10816_숫자_카드2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arrN = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      arrN[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arrN);
    StringBuilder sb = new StringBuilder();

    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int dummy = Integer.parseInt(st.nextToken());
      sb.append(high(arrN,dummy) - low(arrN,dummy)+" ");
    }

    System.out.println(sb);
  }

  public static int low(int[] arr, int dummy){
    int low = 0;
    int high = arr.length;

    while (low < high){
      int mid = (low+high)/2;
      if(dummy<=arr[mid]){
        high = mid;
      }else{
        low = mid+1;
      }
    }
    return low;
  }

  private static int high(int[] arr, int dummy) {
    int low = 0;
    int high = arr.length;

    while (low < high) {
      int mid = (low + high) / 2;
      if (dummy < arr[mid]) {
        high = mid;
      }else {
        low = mid + 1;
      }
    }
    return low;
  }
}
