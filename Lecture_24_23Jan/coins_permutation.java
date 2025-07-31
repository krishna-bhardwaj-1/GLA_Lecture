package Lecture_24_23Jan;

public class coins_permutation {
    static int c;
    public static void main(String[] args) {
        c=0;
        int[] coin={1,2,3,5};
        int amount=5;
        permutation(coin,amount,"");
        System.out.println(c);
    }
    public static void permutation(int[] coin,int amount,String ans){
        if(amount==0){
            c++;
            System.out.println(ans);
            return;
        }
        for(int i=0;i<coin.length;i++){
            if(amount>=coin[i]){
                permutation(coin,amount-coin[i],ans+coin[i]);
            }
        }
    }
}
