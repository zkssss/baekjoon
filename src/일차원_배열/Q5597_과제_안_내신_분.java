package 일차원_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5597_과제_안_내신_분 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[30];
		for(int i=0;i<28;i++){
			num[Integer.parseInt(br.readLine())-1]++;
		}

		int count=1;
		for(int i:num){
			if(i==0){
				System.out.println(count);
			}
			count++;
		}
	}
}
