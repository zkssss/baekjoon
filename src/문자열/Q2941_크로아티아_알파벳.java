package 문자열;

import java.util.Scanner;

public class Q2941_크로아티아_알파벳 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = 0;
		
		for(int i=0;i<word.length()-1;i++) {
			if(word.charAt(i) == 'c') {
				if(i<word.length()-1) {
					if(word.charAt(i+1) == '=' || word.charAt(i+1) == '-') {
						count++;
					}
				}
			}else if(word.charAt(i) == 'd') {
				if(i<word.length()-1) {
					if(word.charAt(i+1) == 'z') {
						if(i<word.length()-2) {
							if(word.charAt(i+2) == '=') {
								count+=2;
								i+=2;
							}
						}
						
					}else if(word.charAt(i+1) == '-') {
						count++;
					}
				}
			}else if(word.charAt(i)=='l') {
				if(word.charAt(i+1)=='j') {
					count++;
				}
			}else if(word.charAt(i)=='n') {
				if(word.charAt(i+1)=='j') {
					count++;
				}
			}else if(word.charAt(i)=='s') {
				if(word.charAt(i+1)=='=') {
					count++;
				}
			}else if(word.charAt(i)=='z') {
				if(word.charAt(i+1)=='=') {
					count++;
				}
			}
		}
		
		System.out.println(word.length() - count);
	}
}
