package 기본수학2;

import java.util.*;
import java.io.*;

public class Q4948_베르트랑_공준 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while(sc.hasNext()){
            int count=0;
            for(int i=n+1;i<=2*n;i++){
                boolean flag = true;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        flag=false;
                        break;
                    }
                }
                if(flag==true & i!=1){
                    count++;
                }
            }
            sb.append(count+"\n");
            n = sc.nextInt();
            if(n==0){
                break;
            }
        }
        System.out.println(sb);
    }
}