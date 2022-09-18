package 문자열;

import java.math.BigInteger;
import java.util.Scanner;

public class Q11720_숫자의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger a = sc.nextBigInteger();
		BigInteger sum = BigInteger.ZERO;
		
		while(a!=BigInteger.ZERO) {
			sum = sum.add(a.remainder(BigInteger.TEN));
			a = a.divide(BigInteger.TEN);
		}
		
		System.out.println(sum);
		
	}
}
