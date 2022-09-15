package oneDimensionalArray;

import java.util.Scanner;

public class Q1546_평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] score = new float[n];
		float max = 0;
		float hap=0;
		
		for(int i=0;i<n;i++) {
			score[i] = sc.nextInt();
		}
		
		for(float i : score) {
			if(i>max) {
				max = i;
			}
		}
		
		for(int i=0;i<n;i++) {
			hap+=score[i]/max*100;
		}
		
		System.out.println(hap/n);
	}
}
