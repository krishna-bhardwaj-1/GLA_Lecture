package Assignment_recursion;

import java.util.Scanner;

public class rat_in_a_maze {
    static boolean c;
    public static void main(String[] args) {
        c=false;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] maze=new int[n][n];
        for(int i=0;i<n;i++) {
            for (int j = 0; j <n; j++) {
                maze[i][j] =sc.nextInt();
            }
        }
        printpath(maze,0,0,n-1,n-1,"",new boolean[n][n]);
        if(c==false){
            System.out.print("");
        }
    }
    private static void printpath(int[][] arr,int cr,int cc,int er,int ec,String ans,boolean vis[][]){
        if(cr>er || cc>ec || cc<0 || cr<0 || arr[cr][cc]==0||vis[cr][cc]==true){
            return;
        }
        if(cr==er && cc==ec){
            c=true;
            System.out.print(ans+" ");
            return;
        }
        vis[cr][cc]=true;
        printpath(arr,cr+1,cc,er,ec,ans+"D",vis);
        printpath(arr,cr,cc-1,er,ec,ans+"L",vis);
        printpath(arr,cr,cc+1,er,ec,ans+"R",vis);
        printpath(arr,cr-1,cc,er,ec,ans+"U",vis);
        vis[cr][cc]=false;
    }
}
