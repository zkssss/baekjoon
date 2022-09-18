package 함수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1065_한수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int hansu = 0;
		int count = 0;
		
		while(count<n) {
			count++;
			List<Integer> list = new ArrayList<Integer>();
			int num = count;
			
			while(num!=0) {
				sum = num%10;
				list.add(sum);
				num = num/10;
			}
			
			
			if(list.size()<=2) {
				hansu++;
			}else if(list.size()==4) {
				if(list.get(0)-list.get(1) == list.get(1)-list.get(2) & list.get(1)-list.get(2) == list.get(2)-list.get(3)) {
					hansu++;
				}
			}
			else {
				if(list.get(0)-list.get(1) == list.get(1)-list.get(2)) {
					hansu++;
				}
			}
		}
		System.out.println(hansu);
	}
}
