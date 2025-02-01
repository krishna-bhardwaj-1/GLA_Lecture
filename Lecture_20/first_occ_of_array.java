package Lecture_20;

public class first_occ_of_array {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,4,3,7};
        int item=4;
        System.out.println(find(arr,item,0));
    }
    private static int find(int[] arr,int item,int curr){
        if(arr[curr]==item){
            return curr;
        }
        if(curr==arr.length){
            return 0;
        }
        int recans=find(arr,item,curr+1);
        return recans;
    }
}
