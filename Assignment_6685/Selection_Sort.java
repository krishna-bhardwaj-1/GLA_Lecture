package Assignment_6685;

import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arry=new int[m];
        for(int g=0;g<m;g++)
            arry[g]=sc.nextInt();
        Selectionsort(arry);
        for(int g=0;g<m;g++)
            System.out.println(arry[g]);
    }
    public static void Selectionsort(int[] arry){
        for(int i=0;i<arry.length;i++){
            int idx=gullakno(arry,i);
            int temp=arry[i];
            arry[i]=arry[idx];
            arry[idx]=temp;
        }
    }
    public static int gullakno(int[] arry,int idx){
        int sbsekam=idx;
        for(int j=idx+1;j<arry.length;j++){
            if(arry[sbsekam]>arry[j]){
                sbsekam=j;
            }
        }
        return sbsekam;
    }
}
