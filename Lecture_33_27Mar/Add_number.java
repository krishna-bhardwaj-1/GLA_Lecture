package Lecture_33_27Mar;

public class Add_number {
    public static void main(String[] args) {
        System.out.println(add(2,7));
        System.out.println(add(2,7,9));
        System.out.println(add(2,7,9.5));
        System.out.println(add(2,3,4,5,6,7,8,9,1,10));
    }

    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static int add(int a,int b,double c){
        return (int) (a+b+c);
    }

    public static int add(int... a){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
