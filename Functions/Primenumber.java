package FunctionsOrMethods;

public class Primenumber {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 1; i <= 10; i++) {
            Prime(i);
        }

    }

    public static void Prime(int f) {
        int count = 0;
        for (int i = 2; i < f; i++) {
            if (f % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.print(f + " ");
        }
    }
}
