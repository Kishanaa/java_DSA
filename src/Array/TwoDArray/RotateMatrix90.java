package Array.TwoDArray;
/*
    Q) 90° clockwise rotation of a matrix.
    Time Complexity : O(n^2)
    Space complexity : O(n^2)
    Difficulty level : Hard
 */
public class RotateMatrix90 {
    private static int[][] rotate(int[][] arr){

        int r = arr.length;
        int c = arr[0].length;

        int [][] transposeMatrix = new int[c][r];
        int [][] rotatedMatrix = new int[c][r];

        // First stored the transpose matrix in transposeMatrix
        for (int row = 0; row < r; row++){
            for (int col = 0; col < c; col++){
                transposeMatrix[col][row] = arr[row][col];
            }
        }

        // Rotate the transposeMatrix and store in rotatedMatrix
        for (int row = 0; row < r; row++){
            int reverseIndex = c;
            for (int col = 0; col < c; col++){
                reverseIndex--;
                rotatedMatrix[row][col] = transposeMatrix[row][reverseIndex];
            }
        }

        return rotatedMatrix;
    }
    static void main() {

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotatedMatrix = rotate(arr);

        System.out.println("Before rotation: ");
        for (int[] i : arr){
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("After rotation: ");
        for (int[] i : rotatedMatrix){
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
