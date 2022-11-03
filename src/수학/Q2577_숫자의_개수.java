package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2577_숫자의_개수 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int num = a*b*c;
		String sNum = String.valueOf(num);
		int[] count = new int[10];

		for (int i = 0; i < sNum.length(); i++) {
			count[sNum.charAt(i) - '0']++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
	}
}

