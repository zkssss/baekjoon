package 이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2563_색종이 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    boolean[][] arr = new boolean[100][100];
    int area = 0;

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      for (int j = a; j < a + 10; j++) {
        for (int k = b; k < b + 10; k++) {
          arr[j][k] = true;
        }
      }
    }

    for (int j = 0; j < 100; j++) {
      for (int k = 0; k < 100; k++) {
        if (arr[j][k]) {
          area++;
        }
      }
    }

    System.out.println(area);
  }
}
