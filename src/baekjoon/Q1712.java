package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1712 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		long a = Integer.parseInt(strs[0]); 
		long b = Integer.parseInt(strs[1]); 
		long c = Integer.parseInt(strs[2]); 
		int count = 1;
		
		//가변비용이 가격보다 작으면
		if(b<c) {
			//손익분기점을 넘을때까지
			while(a+(b*count)>=c*count) {
				count++;
			}
		//가변비용이 가격보다 크면, 절대 손익분기점을 넘을 수 없을때
		}else {
			count=-1;
		}
		
		System.out.println(count);
	}
}
