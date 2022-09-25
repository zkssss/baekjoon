package 정렬;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q2750_수_정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		list.sort(Comparator.naturalOrder());
		for(int i=0;i<a;i++) {
			System.out.println(list.get(i));
		}
	}
}