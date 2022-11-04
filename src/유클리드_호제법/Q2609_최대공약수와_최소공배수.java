package 유클리드_호제법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609_최대공약수와_최소공배수 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		System.out.println(gcd(a, b));
		System.out.println((a*b)/gcd(a, b));

	}
	public static int gcd(int p, int q)
	{
		if (q == 0) return p;
		return gcd(q, p%q);
	}
}



