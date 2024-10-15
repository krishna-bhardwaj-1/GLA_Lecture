package Assignment_6685;

import java.util.Scanner;

public class How_many_questions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        while(n>0) {
            int[] arr = new int[3];
            for(int g=0;g<3;g++){
                arr[g]=sc.nextInt();
            }
            a+=valid(arr);
            n--;
        }
        System.out.print(a);
    }
    public static int valid(int[] arr){
        int que=0;
        for(int g=0;g<3;g++){
            if(arr[g]==1) que++;
        }
        if(que>=2) return 1;
        return 0;
    }
}
