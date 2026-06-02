package Array.TwoDArray;
/*
    Q) Print Matrix in Spiral Order.
    Time Complexity : O(m*n)
    Space complexity : O(1)
    Difficulty level : Hard
 */
public class SpiralPrintMatrix {
    private static void spiral(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        int rowStarting = 0;
        int colStarting = 0;
        int colEnding = c-1;
        int rowEnding = r-1;

        while (rowStarting <= rowEnding && colStarting <= colEnding){

            // top row
            for (int col = colStarting; col <= colEnding; col++){
                System.out.print(arr[rowStarting][col]+" , ");
            }
            rowStarting++;

            // right column
            for (int row = rowStarting; row <= rowEnding; row++){
                System.out.print(arr[row][colEnding]+" , ");
            }
            colEnding--;

            // bottom row
            if (rowStarting <= rowEnding) {
                for (int col = colEnding; col >= colStarting; col--) {
                    System.out.print(arr[rowEnding][col] + " ");
                }
                rowEnding--;
            }

            // left column
            if (colStarting <= colEnding) {
                for (int row = rowEnding; row >= rowStarting; row--) {
                    System.out.print(arr[row][colStarting] + " ");
                }
                colStarting++;
            }

        }
    }
    static void main() {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        spiral(arr);
    }
}
