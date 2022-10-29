package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Q1181_단어_정렬 {

  public static void main(String[] args) throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[i] = st.nextToken();
    }

    Arrays.sort(arr);
    Arrays.sort(arr, Comparator.comparing(String::length));
    LinkedHashSet lhs = new LinkedHashSet(Arrays.asList(arr));

    for (Object o:lhs) {
      System.out.println(o);
    }
  }
}
