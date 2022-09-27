package 기본수학2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11653_소인수분해 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		if(n==1) {
			
		}else if(n<=3) {
			list.add(n);
		}else {
			for(int i=2;i<n;i++) {
				if(n%i == 0) {
					list.add(i);
					n/=i;
					i=1;
				}else if(n/i<=1) {
					list.add(n);
					break;
				}
			}
			for(int i : list) {
				System.out.println(i);
			}
		}
	}
}
