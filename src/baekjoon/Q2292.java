package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count=1;
		int value=2;
		
		while(value<=n) {
			value+=count*6;
			count++;
		}
		if(n==1) {
			System.out.println(1);
		}else {
			System.out.println(count);
		}
	}
} 