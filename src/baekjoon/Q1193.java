package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int hap =0;
		int n=0;
		int num=0;
		int a=0;
		int b=0;
		
		while(x>hap) {
			//몇번째 대각선 
			n++;
			//x가 더 클때까지의 합
			hap = n*(n+1)/2;
		}
		//이전 대각선까지의 합을 x에서 빼서 해당 대각선에서 몇번째에 해당하는지
		num = x-n*(n-1)/2;
		
		//짝수행
		if(n%2==0) {
			a=num;
			b=n-num+1;
		}else { //홀수행
			a=n-num+1;
			b=num;
		}
		
		System.out.println(a+"/"+b);
		
	}
}
