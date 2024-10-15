package Lecture_8;

public class Majority_elements_169LC {
    public static void main(String[] args) {
        //Morevoting
        int[] arr={2,2,1,1,1,2,2};
        System.out.println(More_Voting(arr));
    }
    public static int More_Voting(int[] arr){
        int e=arr[0];
        int v=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==e){
                v++;
            }
            else{
                v--;
                if(v==0){
                    e=arr[i];
                    v=1;
                }
            }
        }
        return e;
    }
}
