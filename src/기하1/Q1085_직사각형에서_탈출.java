package 기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085_직사각형에서_탈출 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int min=Integer.MAX_VALUE;

		if(x<min){
			min=x;
		}
		if(y<min){
			min=y;
		}
		if(Math.abs(w-x)<min){
			min=w-x;
		}
		if(Math.abs(h-y)<min){
			min=h-y;
		}

		System.out.println(min);
	}
}