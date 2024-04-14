package TwoDArrays;

public class diagonalsum {
    public static void main(String[] args) {
        int diagonalSum = 0;
        int[][] arr = { { 1, 2, 3, 4 }, { 3, 4, 5, 6 }, { 1, 2, 3, 4 }, { 4, 5, 6, 7 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    diagonalSum += arr[i][j];
                }
            }
        }
        System.out.print(diagonalSum);
    }
}
