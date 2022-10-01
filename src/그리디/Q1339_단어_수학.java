package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1339_단어_수학 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strs = new String[n];
		for(int i=0;i<n;i++) {
			strs[i] =  br.readLine();
		}
		
		char[] a = new char[n];
		int length = 0;
		for(String s : strs) {
			System.out.println(s);
			System.out.println(s.length());
			if(length<s.length()) {
				length=s.length();
				char count=57;
				for(int i=0;i<n;i++) {
					a[i] = s.charAt(i);
					a[i]=count;
					count--;
					System.out.println(a[i]);
				}
			}
		}
	}
}
