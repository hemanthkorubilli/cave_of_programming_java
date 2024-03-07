package FunctionsOrMethods;

import java.util.*;
import java.lang.Math;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Binary(n));
    }

    public static int Binary(int n) {
        int i = 0;
        int a = n;
        int sum = 0;
        int ref = 0;
        while (n > 0) {
            ref = n % 10;
            sum = (int) (sum + ref * (Math.pow(2, i)));
            n = n / 10;
            i++;
        }
        return sum;
    }
}
