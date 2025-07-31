package Lecture_22_15Jan;

public class Ludo_dice {
    static int count;
    public static void main(String[] args) {
        count=0;
        int n=6;
        sol(n,0,"");
        System.out.println("Total count"+count);
    }
    public static void sol(int n,int curr,String ans){
        if(curr>n){
            return;
        }
        if(curr==n){
            count++;
            System.out.println(ans);
            return;
        }
//        for(;curr<n;curr++){
//            sol(n,curr+n,ans+n);
//        }
        for(int dice=1;dice<=3;dice++){
            sol(n, curr + dice, ans + dice );
        }
    }
}
