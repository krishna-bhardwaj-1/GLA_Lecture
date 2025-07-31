package codeforces;

import java.util.Scanner;

public class Die_Roll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yako = sc.nextInt();
        int wako = sc.nextInt();
        int max = Math.max(yako, wako);
        String[] ans={"1/1","5/6","2/3","1/2","1/3","1/6"};
        System.out.println(ans[max-1]);
    }
}
      /*[0,0,1,0,1,1,1,0,1,1]
        [1,1,1,1,0,1,1,1,1,1]
        [1,1,1,1,1,0,0,0,1,1]
        [1,0,1,0,1,1,1,0,1,1]
        [0,0,1,1,1,0,1,1,1,1]
        [1,0,1,1,1,1,1,1,1,1]
        [1,1,1,1,0,1,0,1,0,1]
        [0,1,0,0,0,1,0,0,1,1]
        [1,1,1,0,1,1,0,1,0,1]
        [1,0,1,1,1,0,1,1,1,0]*/