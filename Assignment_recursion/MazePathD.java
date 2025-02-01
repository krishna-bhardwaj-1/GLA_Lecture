package Assignment_recursion;

import java.util.Scanner;

public class MazePathD {
    static int c=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        print(0,0,n-1,m-1,"");
        System.out.print("\n"+c);
    }
    private static void print(int cr,int cc,int er,int ec,String ans){
        if(cr>er || cc>ec){
            return;
        }
        if(cr==er && cc==ec){
            c++;
            System.out.print(ans+" ");
            return;
        }
        print(cr+1,cc,er,ec,ans+"V");
        print(cr,cc+1,er,ec,ans+"H");
        print(cr+1,cc+1,er,ec,ans+"D");
    }
}
