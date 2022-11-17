package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4153_직사각형 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a=1,b=-1,c=-1;
    StringBuilder sb = new StringBuilder();
    while (a!=0 && b!=0 && c!=0){
      StringTokenizer st = new StringTokenizer(br.readLine());
      long big = 0;
      long smallOne = 0;
      long smallTwo = 0;
      a=Integer.parseInt(st.nextToken());
      b=Integer.parseInt(st.nextToken());
      c=Integer.parseInt(st.nextToken());
      
      if(a>b && b>c){
        big=a;
        smallOne=b;
        smallTwo=c;
      }else if(b>a && b>c){
        big=b;
        smallOne=a;
        smallTwo=c;
      } else if (c>a && c>b) {
        big=c;
        smallOne=a;
        smallTwo=b;
      }

      if(a!=0 && b!=0 && c!=0){
        if((smallOne*smallOne)+(smallTwo*smallTwo) == big*big){
          sb.append("right\n");
        }else {
          sb.append("wrong\n");
        }
      }
    }
    System.out.println(sb);
  }

}
