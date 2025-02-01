package Lecture_20;

public class power {
    public static void main(String[] args) {
        int a=3;
        int n=4;
        System.out.println(pow(3,4));
    }
    private static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        int rec=pow(a,n-1);
        int myans=rec*a;
        return myans;
    }
}
