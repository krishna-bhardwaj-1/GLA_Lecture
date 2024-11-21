package Lecture_18;

public class Stringbuilder_demo2 {
    public static void main(String[] args) {
        //String_Demo();
        //StringBuilder_Demo();
    }
    public static void String_Demo(){
        String s="";
        for(int i=0;i<100000;i++){
            s=s+i;
        }
        System.out.println(s);
    }
    public static void StringBuilder_Demo(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<100000;i++){
            sb=sb.append(i);
        }
        System.out.println(sb);
    }
}
