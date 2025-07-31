package Lecture_21_09Jan;

public class factorial {
    public static void main(String[] args) {
        System.out.println(sol(5));
    }
    private static int sol(int n){
        if(n==0||n==1){
            return n;
        }
        int c1=sol(n-1);
        int c2=sol(n-2);
        return c1+c2;
    }
}
