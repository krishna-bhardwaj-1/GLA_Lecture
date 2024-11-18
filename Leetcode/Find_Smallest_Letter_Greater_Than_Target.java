package Leetcode;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target='c';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int lo=0;
        int hi=letters.length-1;
        char ans=letters[0];
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(letters[mid]>target){
                ans=letters[mid];
                hi=mid-1;
            }
            else {
                lo=mid+1;
            }
        }
        return ans;
    }
}
