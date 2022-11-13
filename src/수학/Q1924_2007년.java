package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1924_2007년 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int month = Integer.parseInt(st.nextToken());
    int day = Integer.parseInt(st.nextToken());
    int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    String[] sDay = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    for (int i = 0; i < month; i++) {
      day += months[i];
    }
    day--;
    System.out.println(sDay[day%7]);
  }
}
