package Lecture_26_05Feb;

import java.util.Scanner;

public class Nqueen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] board=new int[n][n];
        sol(0,board,n);
    }
    private static void sol(int cr,int[][] board,int n){
        if(cr==n){
            display(board);
            return;
        }
        for(int cc=0;cc<n;cc++){
            if(kyameionqueenrakhsktahu(board,cr,cc)){
                board[cr][cc]=1;
                sol(cr+1,board,n);
                board[cr][cc]=0;
            }
        }
    }
    private static boolean kyameionqueenrakhsktahu(int[][] board,int cr,int cc){
        for(int row=0;row<cr;row++){
            if(board[row][cc]==1){
                return false;
            }
        }
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
    private static void display(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");;
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
    }
}
