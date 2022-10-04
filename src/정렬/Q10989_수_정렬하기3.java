package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10989_수_정렬하기3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[10001];
		
		for(int i=0;i<n;i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<10001;i++) {
			while(arr[i]>0) {
				sb.append(i+"\n");
				arr[i]--;
			}
		}
		System.out.println(sb);
	}
}
