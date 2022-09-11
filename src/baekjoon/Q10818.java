package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
        
		//정수 갯수 설정
		int n = sc.nextInt();
		//설정한 갯수에 맞는 배열 생성
		int[] arr = new int[n];
        
		//배열에 설정한 갯수만큼 숫자 입력받아 추가
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
        
		//정렬
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[n-1]);
	}
}