package Array.TwoDArray;
/*
    Q) Transpose a Matrix.
    Time Complexity : O(n^2)
    Space complexity : O(n^2)
    Difficulty level : Easy
 */
public class MatrixTranspose {
    private static int[][] transpose(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        int[][] newMatrix = new int[c][r];  // new array row length = old array col length vice versa

        for (int row = 0; row < r; row++){
            for (int col = 0; col < c; col++){
                newMatrix[col][row]=arr[row][col];
            }
        }
        return newMatrix;
    }
    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] newMatrix = transpose(arr);

        System.out.println("Before Transpose: ");
        for (int[] i : arr){
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("After Transpose: ");
        for (int[] i : newMatrix){
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
