package 기하1;

import java.util.Scanner;

public class Q1002_터렛 {

	public static void main(String[] args) {
		// 터렛 위치 x1,y1 x2,y2
		// 그로부터 거리 r1, r2
		// 고정좌표로부터 일정거리만큼 떨어져 있는 점을 계속 이으면 원이됨

		// 발생하는 케이스
		// 터렛 위치와 거리가 같으면 원이 겹치므로 접점 무한대 -1 출력
		// 원안에 원이 위치하거나 원 사이의 거리가 멀때 접점 0
		// 내접, 외접할때 접점1
		// 접점 2개인 상태로 원이 겹칠때
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int i = 0; i < testCase; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();

			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			System.out.println((Contact(x1, y1, r1, x2, y2, r2)));
		}

	}

	public static int Contact(int x1, int y1, int r1, int x2, int y2, int r2) {
		// 거리공식
		int distancePow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		// 원이 정확하게 겹칠때
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
			// 원의 중점간 거리가 반지름의 합보다 커서 접하지 않을때
		} else if (distancePow > Math.pow(r1 + r2, 2)) {
			return 0;
			// 원의 중점간 거리가 반지름 길이의 차이보다 작으면 원안에 원이 있는 형태
		} else if (distancePow < Math.pow(r2 - r1, 2)) {
			return 0;
			// 원의 중점간 거리와 반지름 길이의 차이가 동일하면 원안의 원이 내접한 상태
		} else if (distancePow == Math.pow(r2 - r1, 2)) {
			return 1;
			// 중점간의 거리가 반지름 길이의 합과 같으면 외접한 상태
		} else if (distancePow == Math.pow(r1 + r2, 2)) {
			return 1;
			// 그 외의 케이스는 두점이 겹쳐지는 상황
		} else {
			return 2;
		}

	}

}
