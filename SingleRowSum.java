public class SingleRowSum {
    // Print second Row sum...
    public static void rowSum(int arr[][]){
        int m = arr[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + arr[1][i];
        }
        System.out.println("Second Row Sum = "+sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},
        };

        rowSum(matrix);
    }
}
