package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int distance=6;
		
		while(true) {
			if(n<distance) {
				System.out.println(count);
				break;
			}
			count++;
			distance+=6;
		}
		
	}
}
