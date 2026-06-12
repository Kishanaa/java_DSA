package leetCode;

public class SearchIn2D74 {
    static boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int start = 0;   // to find the first index in 1D array
        int end = (totalRow * totalCol) -1;


        while (start <= end){
            int mid = start + (end - start)/2;
            int rowIndex = mid/totalCol;
            int colIndex = mid%totalCol;
            if (matrix[rowIndex][colIndex]==target){
                return true;
            }
            if (matrix[rowIndex][colIndex]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return false;
    }
    static void main() {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
}
