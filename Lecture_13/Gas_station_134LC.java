package Lecture_13;

public class Gas_station_134LC {
    public static void main(String[] args) {
        int[] gas ={1,2,3,4,5};
        int[] cost ={3,4,5,1,2};
    }
    public static int cancomplete(int[] gas,int[] cost){
        int total=0;
        for(int i=0;i<cost.length;i++){
            total+=gas[i]-cost[i];
        }
        if(total<0){
            return -1;
        }
        int idx=0;
        int currfuel=0;
        for(int i=0;i<cost.length;i++){
            currfuel+=gas[i]-cost[i];
            if(currfuel<0){
                currfuel=0;
                idx=i+1;
            }
        }
        return idx;
    }
}
