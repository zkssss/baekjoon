package 수학;

import java.util.Scanner;

public class Q2460_지능형_기차2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int train = 0;
		int max = 0;

		for(int i=0;i<10;i++) {
			int outTrain = sc.nextInt();
			int inTrain = sc.nextInt();
			train-=outTrain;
			train+=inTrain;
			if(train>max) max=train;
		}
		System.out.println(max);
	}
}