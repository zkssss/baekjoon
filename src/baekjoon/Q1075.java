package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Q1075 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int f = sc.nextInt();
		
		// 100의 자리 이하는 버림
		n = n/100;
		n = n*100;
		
		// 버린 이후 값을 f로 나눴을때 몫
		int q = n/f;
		
		// 무조건 뒤에 두자리를 00으로 바꾼다음 최대한 근접한 곱셈값을 구한다. 이후 그다음 근접한 곱셈값의 바로다음 곱셈값을 구한 후
		// 맨 뒤에 두자리만 출력
		int result = (f*(q+1))%100;
		String sResult = String.valueOf(result);
		
		if(result==f) {
			System.out.println("00");
		}else {
			if(sResult.length()==1) {
				System.out.println("0"+result);
			}else {
				System.out.println(result);
			}
		}
		
	}
}