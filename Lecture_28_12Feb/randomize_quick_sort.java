package Lecture_28_12Feb;
import java.util.Arrays;
import java.util.Random;

public class randomize_quick_sort {
    public static void main(String[] args) {
        int[] arr={5,7,2,1,8,3,4};
        Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void Sort(int[] arr,int si,int ei){
        if(si >= ei){
            return;
        }
        int idx= partition(arr,si,ei);
        Sort(arr,si,idx-1);
        Sort(arr,idx+1,ei);
    }
    public static int partition(int[] arr,int si,int ei){
        Random rn=new Random();
        int ri=rn.nextInt(ei-si)+si;
        int tt=arr[ei];
        arr[ei]=arr[ri];
        arr[ri]=tt;
        int item=arr[ei];
        int idx=si;
        for(int i=si;i<ei;i++){
            if(arr[i]<=item){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[idx];
        arr[idx]=temp;
        return idx;
    }
}
