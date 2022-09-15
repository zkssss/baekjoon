package 반복문;

import java.util.Scanner;

public class Q1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cycle = 0;
		String num = "";
		String beforeNum ="";
		
		if(n<10) {
			num = "0"+String.valueOf(n); 
		}else {
			num = String.valueOf(n);
		}
		
		String result = num;
		beforeNum = num;
		
		while(true) {
			cycle++;
			int hap = Integer.parseInt(String.valueOf(result.charAt(0))) + Integer.parseInt(String.valueOf(result.charAt(1)));
			result = String.valueOf(Integer.parseInt(beforeNum)%10 +""+ hap%10);
			if(Integer.parseInt(result)<10) {
				beforeNum = result;
			}else {
				beforeNum = "0"+result;
			}
			if(Integer.parseInt(result) == n) {
				break;
			}
		}
		System.out.println(cycle);
	}
}
