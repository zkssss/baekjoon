package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q18870_좌표_압축 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] sortedArr = new int[n];
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0;i<n;i++){
			arr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(sortedArr);

		int rank = 0;
		for(int i : sortedArr){
			if(!hashMap.containsKey(i)){
				hashMap.put(i, rank);
				rank++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i : arr) {
			int value = hashMap.get(i);
			sb.append(value+" ");
		}
		System.out.println(sb);
	}
}
