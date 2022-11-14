package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q25965_미션_도네이션 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    long n = Long.parseLong(br.readLine());

    for(int i=0;i<n;i++) {
      ArrayList<Long> k = new ArrayList<>();
      ArrayList<Long> d = new ArrayList<>();
      ArrayList<Long> a = new ArrayList<>();
      Long hap = 0L;
      int m = Integer.parseInt(br.readLine());
      for (int j = 0; j < m; j++) {
        st = new StringTokenizer(br.readLine());
        k.add(Long.parseLong(st.nextToken()));
        d.add(Long.parseLong(st.nextToken()));
        a.add(Long.parseLong(st.nextToken()));
      }
      st = new StringTokenizer(br.readLine());
      Long intK = Long.parseLong(st.nextToken());
      Long intD = Long.parseLong(st.nextToken());
      Long intA = Long.parseLong(st.nextToken());
      for (int j = 0; j < m; j++) {
        Long kda = (k.get(j)*intK)-(d.get(j)*intD)+(a.get(j)*intA);
        if(kda>0){
          hap+=kda;
        }
      }
      sb.append(hap+"\n");
    }
    System.out.println(sb);
  }
}
