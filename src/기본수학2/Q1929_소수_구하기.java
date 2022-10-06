package 기본수학2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1929_소수_구하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for(int i=m;i<=n;i++) {
			boolean flag = true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=false;
                    break;
				}
			}
			if(flag==true & i!=1) {
				sb.append(i+"\n");
			}
		}
        System.out.println(sb);
	}
}
