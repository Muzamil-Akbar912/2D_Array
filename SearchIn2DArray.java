public class SearchIn2DArray {
    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {
                        {12, 5, 7, 8},
                        {1, 14, 8, 20},
                        {3, 18, 10, 11},
                        {33, 17, 19, 21}
                    };
        
        int key = 10;
        System.out.println(search(arr, key));
    }
}
