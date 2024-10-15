package Lecture_10;

public class First_bad_version_LC278 {
    public static void main(String[] args) {

//    }
//    public static boolean isBadVersion(){
//
//    }
//    public static int firstBadVersion(int n){
//        int lo=1;
//        int hi=n;
//        int ans=0;
//        while(lo<=hi){
//            int mid=(lo+hi)/2;
//            if(isBadVersion(mid)==true){
//                ans=mid;
//                hi=mid-1;
//            }
//            else {
//                lo=mid+1;
//            }
//        }
//        return ans;
    }
}

//On leetcode
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/*
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo=1;
        int hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isBadVersion(mid)==true){
                ans=mid;
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        return ans;
    }
}
*/