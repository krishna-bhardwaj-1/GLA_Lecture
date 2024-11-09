package Leetcode;

public class Integer_to_roman {
    public static void main(String[] args) {
        int num=3749;
        System.out.println(intToRoman(num));
    }
    public static String intToRoman(int num) {
        String roman="";
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanletter={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                roman+=romanletter[i];
                num-=values[i];
            }
        }
        return roman;
    }
}
