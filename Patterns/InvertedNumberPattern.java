package Patterns;

public class InvertedNumberPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int ref = 1;
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(ref);
                ref++;
            }
            System.out.println();
        }
    }
}
