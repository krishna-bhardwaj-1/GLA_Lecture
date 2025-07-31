package Lecture_24_23Jan;

public class coin_combination {
    public static void main(String[] args) {
        int[] coin={1,2,3,5};
        int amount=5;
        permutation(coin,amount,"",0);
    }
    public static void permutation(int[] coin,int amount,String ans,int idx){
        if(amount==0){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i]){
                permutation(coin,amount-coin[i],ans+coin[i],i);
            }
        }
    }
}
