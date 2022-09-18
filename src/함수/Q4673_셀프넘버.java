package 함수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q4673_셀프넘버 {
	public static void main(String[] args) {
		List<Integer> selfNum = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		int count = 1;
		
		while(count<=10000) {
			int num = count;
			int sum = count;
			selfNum.add(count);
			
			while(num!=0) {
				sum = sum + (num%10);
				num = num/10;
			}
			list.add(sum);
			count++;
		}
		Collections.sort(list);
		selfNum.removeAll(list);
		
		for(int i : selfNum) {
			System.out.println(i);
		}
	}
}
