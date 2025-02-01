package Assignment_recursion;

import java.util.Scanner;

public class Nqueen {
    static int c;
    public static void main(String[] args) {
        c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] board=new int[n][n];
        sol(board,0,n);
        System.out.print("\n"+c);
    }
    private static void sol(int[][] board,int cr,int n){
        if(cr==n){
            c++;
            display(board);
            return;
        }
        for(int cc=0;cc<n;cc++){
            if(kyameinqueenrakhsktahu(board,cr,cc)){
                board[cr][cc]=1;
                sol(board,cr+1,n);
                board[cr][cc]=0;
            }
        }
    }
    private static boolean kyameinqueenrakhsktahu(int[][] board,int cr,int cc){
        //upper m check kr
        for(int row=0;row<cr;row++){
            if(board[row][cc]==1){
                return false;
            }
        }
        //left diagonal check kr
        int row=cr;
        int col=cc;
        while (row>=0 && col>=0){
            if(board[row][col]==1){
                return false;
            }
            row--;
            col--;
        }

        row=cr;
        col=cc;
        while (row>=0 && col<board[0].length){
            if(board[row][col]==1){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
    private static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    System.out.print("{"+(i+1)+"-"+(j+1)+"} ");
                }
            }
        }
        System.out.print(" ");
    }
}
