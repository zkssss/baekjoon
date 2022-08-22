package baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		학생 수 
		int n = sc.nextInt();
		PriorityQueue<student> pq = new PriorityQueue<student>();
		
		for(int i=0;i<n;i++) {
			String name=sc.next();
			int ko=sc.nextInt();
			int en=sc.nextInt();
			int math=sc.nextInt();
			pq.add(new student(name, ko, en, math));
		}
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
			if(this.en==o.en) {
				if(this.ko==o.ko) {
					if(this.math==o.math) {
						return this.name.compareTo(o.name);
					}
					return o.math-this.math;
				}
				return this.ko-o.ko;
			}
			return o.en-this.en;
		}
		
	}
}