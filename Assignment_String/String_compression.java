package Assignment_String;

import java.util.Scanner;

public class String_compression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        compression(s);
    }
    public static void compression(String s){
        String st="";
        char ans=s.charAt(0);
        int c=1;
        for(int i=1;i<s.length();i++){
            if(ans==s.charAt(i)){
                c++;
            }
            else{
                st+=ans;
                st+=c;
                c=1;
                ans=s.charAt(i);
            }
        }
        st+=ans;
        st+=c;
        System.out.println(st);
    }
}
