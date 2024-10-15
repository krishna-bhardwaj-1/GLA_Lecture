package Lecture_9;
//2 index k baad kis index p value sbse km h
public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={4,-1,5,3,2,1,7};
        System.out.println(main_forn_ith_index(arr,2));
    }
    public static int main_forn_ith_index(int[] arr,int i){
        int mini=i;
        for(int j=i+1;j< arr.length;j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
        return mini;
    }
}
