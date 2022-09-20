package 문자열;

import java.util.Scanner;

public class Q10809_알파벳찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] a = new String[s.length()]; 
				
		for(int i=97;i<=122;i++) {
			System.out.print(s.indexOf(i)+" ");
		}
		
	}
}
