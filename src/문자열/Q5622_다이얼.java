package 문자열;

import java.util.Scanner;

public class Q5622_다이얼 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int count = 0;
		
		for(int i=0;i<word.length();i++) {
			int val = word.charAt(i);
			
			if(val<68) {
				count+=3;
			}else if(val<71) {
				count+=4;
			}else if(val<74) {
				count+=5;
			}else if(val<77) {
				count+=6;
			}else if(val<80) {
				count+=7;
			}else if(val<84) {
				count+=8;
			}else if(val<87) {
				count+=9;
			}else if(val<91) {
				count+=10;
			}else {
				count+=11;
			}
		}
		
		System.out.println(count);
		
	}
}
