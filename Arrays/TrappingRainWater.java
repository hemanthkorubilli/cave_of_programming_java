package Arrays;

import java.util.*;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Trappedwater(arr);
        System.out.println(ans);

    }

    static int Trappedwater(int arr[]) {
        int n = arr.length;
        int[] leftmax = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }
        int[] rightmax = new int[n];
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            trappedwater += waterlevel - arr[i];
        }
        return trappedwater;

    }
}
