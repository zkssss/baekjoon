package 문자열;

import java.util.Scanner;

public class Q5598_카이사르_암호 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		String pwd = sc.next();
		char[] a = new char[pwd.length()];
		for(int i=0;i<pwd.length();i++) {
			a[i] = pwd.charAt(i);
			int num = (int)a[i];
			
			if(num-3<'A') {
				num+=23;
			}else {
				num-=3;
			}
			
			a[i] = (char)num;
			
			System.out.print(a[i]);
		}
	}
}