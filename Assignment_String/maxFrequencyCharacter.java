package Assignment_String;

import java.util.Scanner;

public class maxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        maxfrequency(s);
    }
    public static void maxfrequency(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]+=1;
        }
        int max=0;
        char ch=' ';
        for(int i=0;i<s.length();i++){
            if(max<arr[s.charAt(i)-97]){
                max=arr[s.charAt(i)-97];
                ch = s.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
