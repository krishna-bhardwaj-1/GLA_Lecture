package Lecture_23_16Jan;

public class unique_path {
    public static void main(String[] args) {
        int m=3;
        int n=3;
        path(0,0,m-1,n-1,"");
    }
    public static void path(int cr,int cc,int er,int ec,String ans){
        if(cr>er || cc>ec){
            return;
        }
        if(cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        path(cr+1,cc,er,ec,ans+"H");
        path(cr,cc+1,er,ec,ans+"V");
    }
}
