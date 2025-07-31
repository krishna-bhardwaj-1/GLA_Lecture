package Lecture_23_16Jan;

public class letter_combination {
    static String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        helper("23","");
    }
    public static void helper(String digit,String comb){
        if(digit.length()==0){
            System.out.println(comb);
            return;
        }
        char ch=digit.charAt(0);
        int index=ch-'0';
        String mappedString=mapping[index];
        for(int i=0;i<mappedString.length();i++){
            String bachistring=digit.substring(1);
            char choice=mappedString.charAt(i);
            helper(bachistring,comb+choice);
        }
    }
}
