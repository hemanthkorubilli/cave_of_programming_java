package Arrays;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        SubArray(arr);
    }

    public static void SubArray(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    sum = sum + arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(max);
    }
}
