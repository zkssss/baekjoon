package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10250_ACM_호텔 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int h=0;
		int w=0; 
		int n=0;
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			
			int room = 0;
			int floor = 0;
			if(n%h==0) {
				room = n/h;
				floor=h;
			}else {
				room = n/h+1;
				floor = n%h;
			}
			String r=String.valueOf(room);
			if(room<10) {
				r = "0"+room;
			}
			
			list.add(floor+r);
		}
		
		for(String s : list) {
			System.out.println(s);
		}
		
	}
}

