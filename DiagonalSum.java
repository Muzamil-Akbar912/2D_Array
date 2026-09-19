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

    // Optimized approach O(n)...
    public static void diagonalSum2(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // primary diagonal (i == j)....
            sum += arr[i][i];

            // secondary diagonal (i+j = arr.length-1 or j = arr.length-1-i)...
            if (i != arr.length-1-i) {
                sum += arr[i][arr.length-1-i];
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

        // diagonalSum1(arr);
        diagonalSum2(arr);
    }
}
