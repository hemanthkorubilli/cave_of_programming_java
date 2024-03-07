package FunctionsOrMethods;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input number : ");
        int n = sc.nextInt();
        System.out.println(Decimal(n));
    }

    public static int Decimal(int n) {
        int ref = 0, bin = 0, i = 0;
        while (n > 0) {
            ref = n % 2;
            bin = (int) (bin + ref * Math.pow(10, i));
            n = n / 2;
            i++;
        }
        return bin;
    }
}
