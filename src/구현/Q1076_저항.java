package 구현;

import java.util.Arrays;
import java.util.Scanner;

public class Q1076_저항 {
	public static void main(String[] args){
		int[] a = new int[10];
		int[] b = new int[10];
		String[] color = new String[]{"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		String hap;
		
		for(int i=0;i<10;i++) {
			a[i]=i;
			b[i]=(int) Math.pow(10, i);
		}
		
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();
		
		int i = Arrays.asList(color).indexOf(x);
		int j = Arrays.asList(color).indexOf(y);
		int k = Arrays.asList(color).indexOf(z);
		if(x.equals("black")){
			hap = String.valueOf(a[i]+a[j]);
		}else {
			hap = String.valueOf(a[i])+String.valueOf(a[j]);
		}
			
		if(z.equals("black")) {
			System.out.println(hap); 		
		}else if(hap.equals("0")) {
			System.out.println(hap);
		}else {
			System.out.println(hap+String.valueOf(b[k]).replace("1", "")); 		
		}
	}
}