package Lecture_5;

public class datatypes_demo_3 {
    public static void main(String[] args) {
        char ch='a';
        System.out.println((int) ch);
        //implicit type casting
        ch++;
        char ch1=97;
        // ch1=ch1+1; // ch=ch+1 -> typecasting           ch+=1   -> no typecasting
        ch1+=1;
        System.out.println(ch1);
    }
}
