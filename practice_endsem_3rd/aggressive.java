package practice_endsem_3rd;

import java.util.Arrays;
import java.util.Scanner;

public class aggressive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int stall=sc.nextInt();
            int noc=sc.nextInt();
            int [] arr=new int[stall];
            for(int i=0;i<stall;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(Largest_minimm(arr,noc));
        }
    }
    public static int Largest_minimm(int[] stall,int noc){
        int lo=0;
        int hi=stall[stall.length-1]-stall[0];
        int ans=0;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(stall,noc,mid)) {
                ans = mid;
                lo = mid + 1;
            }
            else {
                hi=mid-1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] stall,int noc,int mid){
        int cow=1;
        int pos=stall[0];
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
            if(cow==noc){
                return true;
            }
        }
        return false;
    }
}
