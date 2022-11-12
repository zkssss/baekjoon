package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10039_평균_점수 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int hap = 0;

    for (int i = 0; i < 5; i++) {
      int score =Integer.parseInt(br.readLine());
      if(score<=40){
        score=40;
      }
      hap+=score;
    }
    System.out.println(hap/5);
  }
}
