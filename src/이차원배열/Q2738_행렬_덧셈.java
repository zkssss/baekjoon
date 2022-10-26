package 이차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2738_행렬_덧셈 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] a = new int[n][m];
    int[][] b = new int[n][m];
    int count=0;

    for(int k=0;k<2;k++){
      for(int i=0;i<n;i++){
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        for(int j=0;j<m;j++){
          if(count<3){
            a[i][j] = Integer.parseInt(st2.nextToken());
          }else{
            a[i][j] =  a[i][j] + Integer.parseInt(st2.nextToken());
          }
          count++;
        }
      }
    }

    for(int[] i:a){
      for(int j : i){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
