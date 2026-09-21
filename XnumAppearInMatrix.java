public class XnumAppearInMatrix {
     // Print the how many times 7 appears in 2D array...
    public static void print7Appear(int arr[][]){
        int n = arr.length, m = arr[0].length, count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            } 
        }
        System.out.println("Seven appears "+count +" times");
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 7, 35, 45},
            {27, 29, 7, 48},
            {32, 33, 39, 50},
        };
        print7Appear(matrix);
    }
}
