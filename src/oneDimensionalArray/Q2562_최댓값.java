package oneDimensionalArray;

import java.util.Scanner;

public class Q2562_최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		int count = 0;
		int countNum = 0;
		
		for(int i : arr) {
			count++;
			if(i>max) {
				max = i;
				countNum = count;
			}
		}
		
		System.out.println(max);
		System.out.println(countNum);
	}
}
