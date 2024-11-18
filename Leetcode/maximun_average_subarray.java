package Leetcode;

public class maximun_average_subarray {
    public static void main(String[] args) {
        int[] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int start=0;
        double maxsum=Integer.MIN_VALUE;
        double sum=0;
        //TLE bcz every time we add new sum
        /*
        int c=0;
        while(c<nums.length){
//            System.out.println("k+start "+(k+start));
//            System.out.println("value of c "+c);
            if(c<(k+start)){
                sum+=nums[c];
//                System.out.println("@"+sum);
                c++;
            }
            else{
                sum/=k;
                maxsum=Math.max(maxsum,sum);
                sum-=nums[start];
                start++;
//                System.out.println("start :- "+start);
//                System.out.println("sum "+sum);
//                System.out.println("maximum sum: "+maxsum);
            }
        }
        maxsum=Math.max(maxsum,sum/k);
//        System.out.println("maximum sum final: "+maxsum);
        return maxsum;
        */
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(i>=k-1){
                maxsum = Math.max(maxsum,sum/k);
                sum -= nums[start];
                start++;
            }
        }
        return maxsum;
    }
}
