package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<t;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = 1;
			for(int j=0;j<b;j++) {
				result=result*a;
				if(result>10) {
					result%=10;
					if(result==0) {
						result=10;
					}
				}
			}
			list.add(result);
		}
		for(int i:list) {
			System.out.println(i);
		}
	}

}
