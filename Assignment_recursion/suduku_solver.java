package Assignment_recursion;

import java.util.Scanner;

public class suduku_solver {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] board=new int[9][9];
        for(int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                board[i][j]=sc.nextInt();
            }
        }
        sudoku(board,0,0);
    }
    private static void sudoku(int[][] board,int row,int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            display(board);
            return;
        }
        if(board[row][col]!=0){
            sudoku(board,row,col+1);
        }
        else {
            for(int val=1;val<=9;val++){
                if(isItSafe(board,row,col,val)){
                    board[row][col]=val;
                    sudoku(board,row,col+1);
                    board[row][col]=0;
                }
            }
        }
    }
    private static boolean isItSafe(int[][] board,int row,int col,int val){
        for(int i=0;i<9;i++){
            if(board[i][col]==val){
                return false;
            }
        }
        for (int i=0;i<9;i++){
            if(board[row][i]==val){
                return false;
            }
        }
        int cr=row-row%3;
        int cc=col-col%3;
        for (int i=cr;i<cr+3;i++){
            for (int j=cc;j<cc+3;j++){
                if(board[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
    private static void display(int[][] board){
        for(int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
