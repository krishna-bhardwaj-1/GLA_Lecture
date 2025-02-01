package Lecture_20;

public class print_dec {
    public static void main(String[] args) {
        int n=5;
        dec(n);
    }
    private static void dec(int n){
        if(n==0){
            return;
        }
        dec(n-1);
        System.out.println(n);
//        dec(n-1);
    }
}
