package leetCode;

public class SearchIn2D240 {
    static boolean searchMatrix(int[][] matrix, int target) {
        int maxRow = matrix.length-1;
        int maxCol = matrix[0].length-1;
        int row = 0;
        int col = maxCol;

        while (row <= maxRow && col >= 0){
            int current = matrix[row][col];

            if (current == target){
                return true;
            } else if (current < target) {
                row++;
            }else {
                col--;
            }
        }

        return false;
    }
    static void main() {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(arr,target));
    }
}
