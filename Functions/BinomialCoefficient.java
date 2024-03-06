package FunctionsOrMethods;

public class BinomialCoefficient {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(Binomial(n, r));
    }

    public static int Binomial(int n, int r) {
        int ref1 = fact(n);
        int ref2 = fact(r);
        int ref3 = fact(n - r);
        int bino = (ref1 / (ref2 * ref3));
        return bino;
    }

    public static int fact(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }
}
