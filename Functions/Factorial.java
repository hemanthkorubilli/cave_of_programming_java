package FunctionsOrMethods;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        int ref = 1;
        for (int i = 1; i <= n; i++) {
            ref = ref * i;
        }
        return ref;
    }
}
