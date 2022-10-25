package 일차원_배열;

import java.util.Scanner;

public class Q8958_OX퀴즈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] quiz = new String[t];
		
		
		for(int i=0;i<t;i++) {
			quiz[i] = sc.next();
		}
		
		for(String s : quiz) {
			int score = 0;
			int o = 0;
			for(int i=0 ;i<s.length();i++) {
				if(String.valueOf(s.charAt(i)).equals("O")) {
					o += 1;
				}else {
					o = 0;
				}
				score += o;
			}
			System.out.println(score);
		}
	}
}
