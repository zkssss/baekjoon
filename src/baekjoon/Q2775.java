package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int k=0;
		int n=0;
		int num[][]=new int[15][15];
		List<Integer> list = new ArrayList<Integer>();
		
		// 0층, 1호 각각 값 지정
		for(int i=0;i<15;i++) {
			num[i][1] = 1;
			num[0][i] = i;
		}
		//해당 층의 인원 = 해당 층 호수-1 인원 + 해당 층-1 같은 호수 인원
		for(int i=1;i<15;i++) {
			for(int j=2;j<15;j++) {
				num[i][j] = num[i][j-1] + num[i-1][j];
			}
		}
		
		for(int i=0;i<t;i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			list.add(num[k][n]);
		}
		
		for(int i : list) {
			System.out.println(i);
		}
		
	}
}
