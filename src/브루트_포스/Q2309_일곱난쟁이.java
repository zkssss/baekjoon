package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q2309_일곱난쟁이 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] nanjang = new int[9];
    int hap=0;

    for (int i = 0; i < nanjang.length; i++) {
      nanjang[i] = Integer.parseInt(br.readLine());
    }
    List<Integer> list = new ArrayList<>();

    while(true){
      hap=0;
      list.clear();
      for (int i = 0; i < 7; i++) {
        int ran = (int) (Math.floor(Math.random()*9));
        if(!list.contains(ran)){
          list.add(ran);
          hap+=nanjang[ran];
        }
      }
      if(hap==100 && list.size()==7){
        break;
      }
    }

    List<Integer> tall = new ArrayList<>();
    for(int i : list){
      tall.add(nanjang[i]);
    }
    tall.sort(Comparator.naturalOrder());

    for(int i: tall){
      System.out.println(i);
    }

  }
}
