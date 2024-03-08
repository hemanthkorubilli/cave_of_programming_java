package Arrays;

import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(MaxSum(arr));

    }

    static int MaxSum(int[] arr) {
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];
            if (currsum > max) {
                max = currsum;
            }
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return max;
    }
}
