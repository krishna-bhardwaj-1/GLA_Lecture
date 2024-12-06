package practice_endsem_3rd;

public class kuch {
    public static void main(String[] args) {

    }
    //gas station
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
    //next perm
    public static void nextpermutation(int[] arr){
        int p=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            Reverse(arr,0,n-1);
            return;
        }
        int q=-1;
        for(int i=n-1;i>p;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }
        }
        //swap p & q
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        //reverse from p+1 to last(n-1)
        Reverse(arr,p+1,n-1);
    }
    public static void Reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    //cb number
    public static int PrintSubstring(String s){
        int c=0;
        boolean[] visited= new boolean[s.length()];
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                long num=Long.parseLong(s.substring(i,j));
                if(isCBnumber(num)&&isvisited(visited,i,j)){
                    c++;
                    for(int k=i;k<j;k++){
                        visited[k]=true;
                    }
                }
            }
        }
        return c;
    }
    public static boolean isvisited(boolean[] visited,int i, int j){
        for(int k=i;k<j;k++){
            if(visited[k]==true){
                return false;
            }
        }
        return true;
    }
    public static boolean isCBnumber(long num){
        if(num==0 || num==1){
            return false;
        }
        int[] arr={2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(num%arr[i]==0){
                return false;
            }
        }
        return true;
    }
}
