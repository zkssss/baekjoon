package 정렬;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q25305_커트라인 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		list.sort(Comparator.reverseOrder());
		
		System.out.println(list.get(k-1));
		
	}
}
