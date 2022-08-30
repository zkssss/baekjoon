package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int a=1;
		int b=1;
		int count=1;
		
		for (int i = x; i > 0; i--) {
			count = count * i;
		}
		System.out.println(count);
		
		if(a/2==1) {
			for(int i=0;i<count;i++) {
				b--;
				a++;
			}
		}else {
			for(int i=0;i<count;i++) {
				b++;
				a--;
			}
		}
		
		}
}
