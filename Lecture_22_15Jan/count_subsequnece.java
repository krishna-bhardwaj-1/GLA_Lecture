package Lecture_22_15Jan;

public class count_subsequnece {
    public static void main(String[] args) {
        System.out.print("\n"+count("kush",""));
    }
    public static int count(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        char ch=s.charAt(0);
        int a=count(s.substring(1),ans+ch);
        int b=count(s.substring(1),ans);
        return a+b;
    }
}
