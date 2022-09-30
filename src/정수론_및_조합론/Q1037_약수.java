package 정수론_및_조합론;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q1037_약수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc= new Scanner(System.in);
		 int n = sc.nextInt();
		 List<Integer> list = new ArrayList<Integer>();
		 for(int i=0;i<n;i++) {
			 list.add(sc.nextInt());
		 }
		 
		 list.sort(Comparator.reverseOrder());
		 System.out.println(list.get(0)*list.get(list.size()-1)); 
	}
}