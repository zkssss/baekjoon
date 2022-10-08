package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Q2108_통계학 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		double hap = 0;
		int mid = 0;
		int min=4000;
		int max=-4000;
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			hap+=arr[i];
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		Arrays.sort(arr);
		mid = arr[Math.round((arr.length-1)/2)];
		
		System.out.println(Math.round(hap/n));
		System.out.println(mid);
		System.out.println(Math.abs(max-min));
	}
}
