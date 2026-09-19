public class SpiralMatrix {
    public static void spiral(int arr[][]) {
        int sr = 0;
        int sc = 0;
        int er = arr.length-1;
        int ec = arr[0].length-1;

        while (sr <= er && sc <= ec) {
            // Top...
            for (int j = sc; j <= ec; j++) {
                System.out.print(arr[sr][j] + " ");
            }

            // right...
            for (int i = sr+1; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }

            // bottom...
            for (int j = ec-1; j >= sc; j--) {
                if (sr == er) {
                    break;
                }
                System.out.print(arr[er][j] + " ");
            }

            // left...
            for (int i = ec-1; i >= sr+1; i--) {
                if (sc == ec) {
                    break;
                }
                System.out.print(arr[i][sc] + " ");
            }

            // Update condition...
            sr++;
            sc++;
            er--;
            ec--;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
                        {12, 5, 7, 8},
                        {1, 14, 8, 20},
                        {3, 18, 10, 11},
                        {33, 17, 19, 21}
                    };

        spiral(arr);
    }
}
