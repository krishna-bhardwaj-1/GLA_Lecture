package Assignment_6685;

import java.util.Scanner;

public class Trapping_rain_water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lp=sc.nextInt();
        while(lp>0) {
            int m = sc.nextInt();
            int[] arry = new int[m];
            for (int g = 0; g < m; g++)
                arry[g] = sc.nextInt();
            System.out.println(Trappingwater(arry));
            lp--;
        }
    }
    public static int Trappingwater(int[] arry){
        int p=arry.length;
        int[] left=new int[p];
        int[] rght=new int[p];
        left[0]=arry[0];
        for(int i=1;i<p;i++)
            left[i]=Math.max(left[i-1],arry[i]);
        rght[p-1]=arry[p-1];
        for(int i=p-2;i>=0;i--)
            rght[i]=Math.max(rght[i+1],arry[i]);
        int water=0;
        for(int i=0;i<p;i++)
            water+=Math.min(left[i],rght[i])-arry[i];
        return water;
    }
}
