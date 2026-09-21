public class TransposeMatrix {
    public static void transpose(int matrix[][]) {
        int trans[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                trans[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans.length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},
        };

        transpose(matrix);
    }
}
