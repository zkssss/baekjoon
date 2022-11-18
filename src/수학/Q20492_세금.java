import java.util.*;
import java.io.*;

public class Q20492_세금{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println((int)(n-(n*0.22)));
        System.out.println((int)(n-((n-(n*0.8))*0.22)));
    }
}
