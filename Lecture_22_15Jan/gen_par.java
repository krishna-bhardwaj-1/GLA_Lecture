package Lecture_22_15Jan;

public class gen_par {
    public static void main(String[] args) {
        generate_parenthesis(4,0,0,"");
    }
    private static void generate_parenthesis(int n,int oc,int cc,String ans){
        if(oc==n && cc==n){
            System.out.println(ans);
            return;
        }
        if(oc<n) {
            generate_parenthesis(n, oc + 1, cc, ans + "(");
        }
        if(oc>cc){
            generate_parenthesis(n,oc,cc+1,ans+")");
        }
    }
}
