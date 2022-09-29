package 기본수학2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2581_소수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=m;i<=n;i++) {
			boolean flag = true;
			for(int j=2;j<=i;j++) {
				if(i%j==0 & i!=j) {
					flag=false;
				}
			}
			if(flag==true & i!=1) {
				list.add(i);
			}
		}
		
		int hap=0;
		for(int i:list) {
			hap+=i;
		}

		if(list.size()>0) {
			System.out.println(hap);
			System.out.println(list.get(0));
		}else {
			System.out.println(-1);
		}
	}
}
