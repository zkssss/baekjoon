package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Q10757_큰_수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		BigInteger a = new BigInteger(strs[0]);
		BigInteger b = new BigInteger(strs[1]);
		a = a.add(b);
		System.out.println(a);
	}
}
