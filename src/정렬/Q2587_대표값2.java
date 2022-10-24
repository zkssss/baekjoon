package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2587_대표값2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[5];
		for(int i=0;i<5;i++){
			num[i] = Integer.parseInt(br.readLine());
		}
		int p = 0;
		for(int i:num){
			p+=i;
		}
		Arrays.sort(num);

		System.out.println(p/5);
		System.out.println(num[2]);
	}
}
