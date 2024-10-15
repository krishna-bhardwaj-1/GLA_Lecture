package Leetcode;

public class Best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        System.out.println(maxprofit(a));
    }
    public static int maxprofit(int[] arr){
        int minbuy=Integer.MAX_VALUE;
        int maxsell=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minbuy)
                minbuy=arr[i];
            else if(arr[i]-minbuy>maxsell)
                maxsell=arr[i]-minbuy;
        }
        return maxsell;
    }
}
