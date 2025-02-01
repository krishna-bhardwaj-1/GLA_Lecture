package Assignment_recursion;

import java.util.Scanner;

public class rat_chases_its_cheese {
    static boolean c;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        c=false;
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] maze=new char[n][m];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<m;j++){
                maze[i][j]=s.charAt(j);
            }
        }
        int[][] arr=new int[n][m];
        print(maze,0,0,arr);
        if(c==false){
            System.out.println("NO PATH FOUND");
        }
    }
    private static void print(char[][] maze,int cr,int cc,int[][] arr){
        if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc]=='X'){
            return;
        }
        if(cr==maze.length-1 && cc==maze[0].length-1){
            arr[cr][cc]=1;
            c=true;
            display(arr);
        }
        maze[cr][cc]='X';
        arr[cr][cc]=1;
        print(maze,cr+1,cc,arr);//down
        print(maze,cr,cc+1,arr);//right
        print(maze,cr-1,cc,arr);//up
        print(maze,cr,cc-1,arr);//left
        arr[cr][cc]=0;
        maze[cr][cc]='0';
    }
    private static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
