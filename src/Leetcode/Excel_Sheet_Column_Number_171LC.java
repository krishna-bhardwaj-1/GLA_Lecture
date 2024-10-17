package Leetcode;

public class Excel_Sheet_Column_Number_171LC {
    public static void main(String[] args) {
        String columntitle="AA";
        char[] s=columntitle.toCharArray();
        int sum=0;
        for(int i=0;i<s.length;i++){
            int num=s[i]-64;
            sum=sum*26+num;
        }
        System.out.println(sum);
    }
}
