package 함수;

public class Q15596_정수N개의합 {
	long sum(int[] a) {
		long ans = 0;
		for(long i:a) {
			ans+=i;
		}
		return ans;
	}
}
