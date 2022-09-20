package 문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2675_문자열반복 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			List<String> pList = new ArrayList<String>();
			List<String> list = new ArrayList<String>();
			int r = sc.nextInt();
			String s = sc.next();
			
			for(int j=0;j<s.length();j++) {
				list.add(String.valueOf(s.charAt(j))); 
				for(int k=0;k<r;k++) {
					pList.add(list.get(j));
				}
			}
			for(String p : pList) {
				System.out.print(p);
			}
			System.out.println();
		}
		
	}
}
