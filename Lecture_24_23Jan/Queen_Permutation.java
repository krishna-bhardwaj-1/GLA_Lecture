package Lecture_24_23Jan;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n=4;
        int tq=2;   //total queen
        boolean[] board=new boolean[n];
        permutation(board,tq,"",0);
    }
    private static void permutation(boolean[] board,int tq,String ans,int qpsf){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]!=true){
                board[i]=true;
                permutation(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1);
                board[i]=false;
            }
        }
    }
}
