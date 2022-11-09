package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828_스택 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] stack = new int[n];
    int size = 0;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String word = st.nextToken();
      if(word.equals("push")){
        stack[size] = Integer.parseInt(st.nextToken());
        size++;
      }
      if (word.equals("pop")) {
        if(size==0){
          sb.append(-1).append("\n");
        }else {
          sb.append(stack[size-1]).append("\n");
          stack[size-1] = 0;
          size--;
        }
      }
      if (word.equals("size")) {
        sb.append(size).append("\n");
      }
      if (word.equals("empty")) {
        int emp = 0;
        if(size==0){
          emp = 1;
        }
        sb.append(emp).append("\n");
      }
      if (word.equals("top") ) {
        if(size==0){
          sb.append(-1).append("\n");
        }else{
          sb.append(stack[size-1]).append("\n");
        }
      }
    }
    System.out.println(sb);
  }
}
