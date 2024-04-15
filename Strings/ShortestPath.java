package Strings;

import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y += 1;
            } else if (str.charAt(i) == 'S') {
                y -= 1;
            } else if (str.charAt(i) == 'E') {
                x += 1;
            } else if (str.charAt(i) == 'W') {
                x -= 1;
            }
        }
        int ref = (x * x) + (y * y);
        System.out.println(Math.sqrt(ref));

    }
}
