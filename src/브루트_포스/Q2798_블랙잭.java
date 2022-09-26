package 브루트_포스;

import java.util.Scanner;

public class Q2798_블랙잭 {
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
        
		//카드 갯수 설정
		int n = sc.nextInt();
		if(n<2 || n>100) {
			n = sc.nextInt();
		}
		//숫자M
		int m = sc.nextInt();
		if(m<10 || m>300000) {
			m = sc.nextInt();
		}
		//설정한 갯수에 맞는 배열 생성
		int[] arr = new int[n];

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<=0 || arr[i]>100000) {
				i--;
			}
		}
		
		int sum = 0;
		int result =0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1; k<n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(result<sum && sum<=m) {
						result=sum;
					}
				}
			}
		}
		
		System.out.println(result);
	}
}