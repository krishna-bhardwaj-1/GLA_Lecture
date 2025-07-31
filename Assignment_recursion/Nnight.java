package Assignment_recursion;

import java.util.Scanner;

public class Nnight {
    static int c;
    public static void main(String[] args) {
        c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] board=new int[n][n];
        sol(board,0,0,n,0);
        System.out.print("\n"+c);
    }
    private static void sol(int[][] board,int cr,int cc,int n,int knight){
        if(knight==n){
            c++;
            display(board);
            return;
        }
        if(cc==n){
            cr++;
            cc=0;
        }
        if(cr==n){
            return;
        }
        if (kyameinknightrakhsktahu(board, cr, cc)) {
            board[cr][cc] = 1;
            sol(board, cr, cc+1,n,knight+1);
            board[cr][cc]=0;
        }
        sol(board,cr,cc+1,n,knight);
    }
    private static boolean kyameinknightrakhsktahu(int[][] board,int cr,int cc){
//        if((cr>=2&&cc>=1) ||(cr>=1&&cc>=2)){
//            if(board[cr-2][cc-1]==1){
//                return false;
//            }
//            if(board[cr-1][cc-2]==1){
//                return false;
//            }
//        }
//        return true;
        int[] dx = {-2, -2, -1, 1, 2, 2, 1, -1};
        int[] dy = {-1, 1, 2, 2, 1, -1, -2, -2};

        for (int i = 0; i < 8; i++) {
            int newX = cr + dx[i];
            int newY = cc + dy[i];

            if (newX >= 0 && newX < board.length && newY >= 0 && newY < board[0].length) {
                if (board[newX][newY] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
    private static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    System.out.print("{"+i+"-"+j+"} ");
                }
            }
        }
        System.out.print(" ");
    }
}
