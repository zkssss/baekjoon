package 문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1316_그룹_단어_체커 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=0;i<n;i++) {
			String s = sc.next();
			List<Character> list = new ArrayList<Character>();
			char prev = ' ';
			boolean flag = true;
			
			for(int j=0;j<s.length();j++) {
				if(prev != s.charAt(j)) {
					if(!list.contains(s.charAt(j))) {
						if(flag & j==s.length()-1) {
							count++;
						}
					}else {
						flag = false;
					}
				}else if(flag & j==s.length()-1) {
					count++;
				}
				list.add(s.charAt(j));
				prev = s.charAt(j);
			}
		}
		System.out.println(count);
	}
}
