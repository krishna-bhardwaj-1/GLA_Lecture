package Assignment_String;

import java.util.Scanner;

public class playing_with_good_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(Good_String(str));
    }
    public static int Good_String(String s){
        int ans=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
                c++;
            }
            else {
                ans=Math.max(ans,c);
                c=0;
            }
        }
        ans=Math.max(ans,c);
        return ans;
    }

    public static boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'|c=='u'){
            return true;
        }
        return false;
    }
}
