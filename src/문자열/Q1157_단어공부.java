package 문자열;

import java.util.Scanner;

public class Q1157_단어공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] arr = new int[26];
		int max = 0;
		char c = '?';
		
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>=65 && word.charAt(i)<=90) {
				arr[word.charAt(i) - 65]++;
			}else {
				arr[word.charAt(i) - 97]++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				c = (char)(i+65);
			}else if(arr[i] == max) {
				c = '?';
			}
		}
		System.out.println(c);
		
	}
}
