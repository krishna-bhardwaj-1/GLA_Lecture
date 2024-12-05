package practice_endsem;

import java.util.Scanner;

public class paratha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nop=sc.nextInt();
        int noc=sc.nextInt();
        int maxrank=Integer.MIN_VALUE;
        int[] arr=new int[noc];
        for(int i=0;i<noc;i++){
            arr[i]=sc.nextInt();
            maxrank=Math.max(maxrank,arr[i]);
        }
        int lo=0;
        int hi=(nop*(nop+1)/2)*maxrank;
        int ans=0;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(arr,nop,mid)){
                ans=mid;
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isitpossible(int[] arr,int nop,int mid){
        int cook=0;
        int cntparatha=0;
        for(int i=0;i<arr.length;i++){
            cook=arr[i];
            int fact=1;
            int r=arr[i];
            while (cook<=mid){
                fact++;
                cook+=(fact*r);
                cntparatha++;
                if(cntparatha==nop){
                    return true;
                }
            }
        }
        return false;
    }
}
