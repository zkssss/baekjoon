package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1436_영화감독_숌 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int sixNum = 0;
		int sixNumCount = 0;

		Loop1 :
		for(int i=666;i<Integer.MAX_VALUE;i++){
			int count=0;
			boolean six = false;
			String sVal = String.valueOf(i);
			for(int j=0;j<sVal.length();j++){
				if(Character.getNumericValue(sVal.charAt(j))==6){
					count++;
					six = true;
				}else{
					count=0;
					six=false;
				}

				if(count==3 & six==true){
					sixNum = i;
					sixNumCount++;
				}
				if(sixNumCount == n){
					System.out.println(sixNum);
					break Loop1;
				}

			}
		}
	}
}