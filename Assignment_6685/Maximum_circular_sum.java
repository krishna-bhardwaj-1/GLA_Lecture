package Assignment_6685;

import java.util.Scanner;

public class Maximum_circular_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int p = sc.nextInt();
            int[] arr = new int[p];
            for (int i = 0; i < p; i++) {
                arr[i] = sc.nextInt();
            }
            int maxsum = 0;
            for (int i = 0; i < p; i++) {
                int sum = 0;
                for (int j = p + i - 1; j >= i; j--) {
                    sum += arr[j % p];
                    if(maxsum<sum) maxsum=sum;
                }
            }
            System.out.println(maxsum);
            n--;
        }
    }
}
