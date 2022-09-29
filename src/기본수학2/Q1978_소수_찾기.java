package 기본수학2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1978_소수_찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		int count=0;
		for(int i : list) {
			boolean flag = true;
			for(int j=2;j<i;j++) {
				if(i%j==0 & i!=j) {
					flag=false;
				}
			}
			if(flag==true & i!=1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
