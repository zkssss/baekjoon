package oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10807_개수_세기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int v = Integer.parseInt(br.readLine());
		int count=0;

		for(int i : arr){
			if(i==v){
				count++;
			}
		}
		System.out.println(count);
	}
}
