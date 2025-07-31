package Assignment_recursion;

import java.util.Scanner;

public class chessboard {
    static int c;
    public static void main(String[] args) {
        c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        chess(n,0,0,n-1,n-1,"");
        System.out.print("\n"+c);
    }
    private static void chess(int n,int cr,int cc,int er,int ec,String ans){
        if(cr==er && cc==ec){
            System.out.print(ans+"{"+cr+"-"+cc+"} ");
            c++;
            return;
        }
        if(cr>=n||cc>=n){
            return;
        }
        //knight move
        chess(n,cr+2,cc+1,er,ec,ans+"{"+cr+"-"+cc+"}K");
        chess(n,cr+1,cc+2,er,ec,ans+"{"+cr+"-"+cc+"}K");

        //rook
        if(cr==0||cc==0||cr==er||cc==ec){
            //Vertically
            for(int i=1;i<=n;i++){
                chess(n,cr+i,cc,er,ec,ans+"{"+cr+"-"+cc+"}R");
            }
            //Horizontally
            for (int i=1;i<=n;i++) {
                chess(n, cr, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}R");
            }
        }

        //bishop : diagonally
        if((cr+cc)==ec || cr==cc){
            for (int i=1;i<=n;i++){
                chess(n,cr+i,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}B");
            }
        }
    }
}
