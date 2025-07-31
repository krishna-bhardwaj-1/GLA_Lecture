package Lecture_22_15Jan;

public class lexicographical_sounting {
    public static void main(String[] args) {
        print(0,1000);
    }
    public static void print(int st,int n){
        if(st>n){
            return;
        }
        System.out.println(st);
        int i=0;
        if(st==0) {
            i=1;
        }
        for(;i<=9;i++){
            print(st*10+i,n);
        }
    }
}
