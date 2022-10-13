package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2751_수_정렬하기2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[1000001];
		int[] minusArr = new int[1000001];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			int val = Integer.parseInt(br.readLine());
			
			if(val>=0) {
				arr[val]++;
			}else {
				minusArr[Math.abs(val)]++;
			}
		}
		
		for(int i=1000000;i>0;i--) {
			if(minusArr[i]>0) {
				sb.append(-i+"\n");
			}
		}
		for(int i=0;i<1000001;i++) {
			if(arr[i]>0) {
				sb.append(i+"\n");
			}
		}
		
		System.out.println(sb);
	}
}
