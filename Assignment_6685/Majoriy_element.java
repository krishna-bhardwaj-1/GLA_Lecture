package Assignment_6685;

import java.util.Scanner;

public class Majoriy_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arry=new int[m];
        for(int g=0;g<m;g++)
            arry[g]=sc.nextInt();
        System.out.println(morevoting(arry));
    }
    public static int morevoting(int[] arry){
        int e=arry[0];
        int v=1;
        for(int i=1;i<arry.length;i++){
            if(e==arry[i]) v++;
            else{
                v--;
                if(v==0){
                    e=arry[i];
                    v=1;
                }
            }
        }
        return e;
    }
}
