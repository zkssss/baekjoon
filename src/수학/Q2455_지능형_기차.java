package 수학;

import java.util.Scanner;

public class Q2455_지능형_기차 {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		//열차 내부 인원
		int train = 0;
		//최대 사람 수
		int max = 0;

		//10개의 역
		for(int i=0;i<4;i++) {
			//내린사람
			int outTrain = sc.nextInt();
			//탄사람
			int inTrain = sc.nextInt();
			train-=outTrain;
			train+=inTrain;
			//현재 열차 내부 인원이 최대 사람 수보다 많으면 max에 대입
			if(train>max) max=train;
		}
		System.out.println(max);
	}
}