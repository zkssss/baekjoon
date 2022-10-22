package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2231_분해합 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		for(int i=0;i<n;i++){
			String a = String.valueOf(i);
			int hap = i;
			for(int j=0;j<a.length();j++){
				hap = hap + Integer.parseInt(String.valueOf(a.charAt(j)));
			}
			if(hap==n){
				System.out.println(i);
				break;
			}else if(i==n-1){
				System.out.println(0);
			}
		}
	}
}
