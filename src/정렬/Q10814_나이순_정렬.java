package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q10814_나이순_정렬 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Student[] s = new Student[n];
		for(int i=0;i<n;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			s[i] = new Student(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		Arrays.sort(s, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.age - o2.age;
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n;i++){
			sb.append(s[i]);
		}
		System.out.println(sb);

	}

	static class Student{
		int age;
		String name;

		public Student(int age , String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return age+" "+name+"\n";
		}
	}
}
