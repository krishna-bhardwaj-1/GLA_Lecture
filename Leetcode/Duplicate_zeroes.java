package Leetcode;

import java.util.Arrays;

public class Duplicate_zeroes {
    public static void main(String[] args) {
        int[] write={1,0,2,3,0,4,5,0};
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                for(int j=arr.length-2;j>=i;j--){
//                    arr[j+1]=arr[j];
//                }
//                i++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        int[] read=Arrays.copyOfRange(write,0,write.length);
        int i=0;
        int j=0;
        while(j<write.length){
            if(read[i]!=0){
                write[j]=read[i];
                j++;
            }
            else{
                write[j++] = 0;
                if (j < write.length)
                    write[j++] = 0;
            }
            i++;
        }
        System.out.println(Arrays.toString(write));
    }
}
