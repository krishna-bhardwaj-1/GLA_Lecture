package Assignment_6685;

import java.util.Scanner;

public class Product_of_array_exceptself {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] arry=new int[m];
        for(int g=0;g<m;g++)
            arry[g]=sc.nextInt();
        Long[] store=Productexcptself(arry);
        for(int g=0;g<m;g++)
            System.out.print(store[g]+" ");
    }
    public static Long[] Productexcptself(int[] arry){
        int m=arry.length;
        Long[] lft=new Long[m];
        Long[] rght=new Long[m];
        lft[0]=1L;
        for(int g=1;g<m;g++)
            lft[g]=lft[g-1]*arry[g-1];
        rght[m-1]=1L;
        for(int g=m-2;g>=0;g--)
            rght[g]=rght[g+1]*arry[g+1];
        for(int i=0;i<m;i++)
            lft[i]*=rght[i];
        return lft;
    }
}
