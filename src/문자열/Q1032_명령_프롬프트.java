package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1032_명령_프롬프트 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		try {
			String n = br.readLine();
			
			for(int i=0;i<Integer.parseInt(n);i++) {
				list.add(br.readLine());
			}
			
			String str = list.get(0);
			StringBuilder sb = new StringBuilder(str);
			
			for(int i=0;i<Integer.parseInt(n);i++) {
				for(int j=0;j<list.get(i).length();j++) {
					if(str.charAt(j)!=list.get(i).charAt(j)) {
						sb.setCharAt(j, (char)63);
						str = sb.toString();
					}
				}
			}
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
