package Leetcode;

public class string_compression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));

    }
    public static int compress(char[] chars) {
        int sum=0,c=0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                c++;
            }
            else {
                sum+=(c+2);
                c=0;
            }
            System.out.println(c+" ** "+sum);
        }
        return sum;
    }
}
