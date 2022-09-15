package 조건문;

import java.util.Scanner;

public class Q9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String point = "";
		
		if(score>=90 & score<=100) {
			point = "A";
		}else if(score>=80 & score<=89) {
			point = "B";
		}else if(score>=70 & score<=79) {
			point = "C";
		}else if(score>=60 & score<=69) {
			point = "D";
		}else {
			point = "F";
		}
		
		System.out.println(point);
	}
}
