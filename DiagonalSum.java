public class DiagonalSum {
    // Brute force approach O(n2)...
    public static void diagonalSum1(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                // primary diagonal sum...
                if (i == j) {
                    sum += arr[i][j];
                }
                // secondary diagonal sum...
                else if (i+j == arr.length-1) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The total sum of diagonals = " + sum);
    }
    public static void main(String[] args) {
        int arr[][] = {
                        {12, 5, 7, 8},
                        {1, 14, 8, 20},
                        {3, 18, 10, 11},
                        {33, 17, 19, 21}
                    };

        diagonalSum1(arr);
    }
}
