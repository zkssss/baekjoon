package 브루트_포스;

import java.util.ArrayList;
import java.util.Scanner;

public class Q7568_덩치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		총 인원
		int n = sc.nextInt();
//		인원의 몸무게 및 키
		int[][] bulk = new int[n][2];
//		해당 인원보다 덩치가 더 큰 사람의 수
		int count = 0;
//		count수 리스트
		ArrayList<Integer> countArray = new ArrayList<Integer>();

//		총 인원만큼의 몸무게 및 키 받기
		for (int i = 0; i < n; i++) {
			bulk[i][0] = sc.nextInt();
			bulk[i][1] = sc.nextInt();
		}

//		본인과는 비교하지 않으면서 본인보다 더 덩치가 큰 사람이 존재하면 count++
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && bulk[i][0] < bulk[j][0] && bulk[i][1] < bulk[j][1]) {
					count++;
				}
			}
//		count 최종 값 리스트에 추가하면서 초기화
			countArray.add(count + 1);
			count = 0;
		}

//		덩치 등수는 본인보다 더 덩치가 큰사람 수 +1, 해당 값 출력
		for (int i = 0; i < n; i++) {
			System.out.print(countArray.get(i) + " ");
		}
	}

}
