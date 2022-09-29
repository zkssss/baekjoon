package 기본수학1;

import java.util.Scanner;

public class Q2839_설탕_배달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int big = n/5;
		int small = 0;
		int result = -1;
		
		
		while(big!=-1) {
			if((n-big*5)%3==0) {
				small = (n-big*5)/3;
				result = big+small;
				break;
			}else {
				if(n<5 & n%3==0) {
					result = n/3;
				}
				big--;
			}
		}
		
		System.out.println(result);
	}
}
