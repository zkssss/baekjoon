package baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q10825 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		학생 수 
		int n = sc.nextInt();
//		우선순위 큐
		PriorityQueue<student> pq = new PriorityQueue<student>();
		
		for(int i=0;i<n;i++) {
			String name=sc.next();
			int ko=sc.nextInt();
			int en=sc.nextInt();
			int math=sc.nextInt();
			pq.add(new student(name, ko, en, math));
		}
//		존재할때까지 name출력
		while(!pq.isEmpty()) {
			System.out.println(pq.poll().name);
		}
	}
	
	static class student implements Comparable<student>{
		String name;
		int ko,en,math;
		
		student(String name, int ko, int en, int math){
			this.name=name;
			this.ko=ko;
			this.en=en;
			this.math=math;
		}
		
		@Override
		public int compareTo(student o) {
//			국어점수가 같으면
			if(this.ko==o.ko) {
//				영어점수가 같으면
				if(this.en==o.en) {
//					수학점수가 같으면
					if(this.math==o.math) {
//						이름 비교값 리턴
						return this.name.compareTo(o.name);
					}
//					수학 내림차순
					return o.math-this.math;
				}
//				영어 오름차순				
				return this.en-o.en;
			}
//			국어 내림차순
			return o.ko-this.ko;
		}
		
	}
}