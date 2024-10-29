package Leetcode;

public class tolowercase {
    public static void main(String[] args) {
        String s="HeLLo";
        System.out.println(tolower(s));
    }
    public static String tolower(String s){
         StringBuilder sb=new StringBuilder();

         for(int i=0;i<s.length();i++)
         {
             if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90)
             {
                 sb.append((char)((int)s.charAt(i)+32));
             }
             else{
                 sb.append(s.charAt(i));
             }
         }
         return sb.toString();
    }
}
