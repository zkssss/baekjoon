package 정수론_및_조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5086_배수와_약수 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String msg = "";

		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());

			if(num1==0 & num2==0){
				break;
			}else if(num2 % num1 == 0){
				msg+="factor\n";
			}else if(num1 % num2==0){
				msg+="multiple\n";
			}else{
				msg+="neither\n";
			}
		}

		System.out.println(msg);
	}
}
