package practice_endsem_3rd;

import java.util.Scanner;

public class murthal_paratha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int l = sc.nextInt();
        int maxRank = Integer.MIN_VALUE;
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = sc.nextInt();
            maxRank = Math.max(maxRank, a[i]);
        }
        int e = ((p * (p + 1)) / 2) * maxRank;
        int s = 0;
        int ans = 0;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (isPossible(a, l, p, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean isPossible(int[] a, int l, int p, int maxTime) {
        int cook, cntParatha = 0;
        for (int i = 0; i < l; i++) {
            cook = a[i];
            int fact = 1;
            int r = a[i];
            while (cook <= maxTime) {
                fact++;
                cook += (r * fact);
                cntParatha++;
                if (cntParatha == p) return true;
            }
        }
        return false;
    }
}
