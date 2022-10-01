package 수학;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1009_분산처리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		테스트 케이스 수
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
