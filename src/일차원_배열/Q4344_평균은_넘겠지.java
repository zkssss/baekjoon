package 일차원_배열;

import java.util.Scanner;

public class Q4344_평균은_넘겠지 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int c = sc.nextInt();
		
		for(int i=0;i<c;i++) {
			int n = sc.nextInt();
			int[][] score = new int[c][n];
			float hap = 0;
			float avg = 0;
			float count = 0;
			for(int j=0;j<n;j++) {
				score[i][j] = sc.nextInt();
				hap+=score[i][j];
			}
			avg = hap/n;
			for(int j : score[i]) {
				if(j>avg) {
					count++;
				}
			}
			System.out.println(String.format("%.3f", count/n*100) +"%");
		}
	}
}
