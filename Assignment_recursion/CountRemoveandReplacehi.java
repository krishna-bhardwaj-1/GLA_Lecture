package Assignment_recursion;

import java.util.Scanner;

public class CountRemoveandReplacehi {
    static int c;
    public static void main(String[] args) {
        c=0;
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        StringBuilder bye = new StringBuilder();
        sol(s, 0, ans,bye);
        System.out.println(c);
        System.out.println(ans);
        System.out.println(bye);
    }
    private static void sol(String s,int cr,StringBuilder ans,StringBuilder bye){
        if(cr==s.length()){
            return;
        }
        if(cr<s.length()-1 && (s.charAt(cr)=='h' && s.charAt(cr+1)=='i')){
            c++;
            bye.append("bye");
            cr+=2;
        }
        else {
            bye.append(s.charAt(cr));
            ans.append(s.charAt(cr));
            cr+=1;
        }
        sol(s,cr,ans,bye);
    }
}
