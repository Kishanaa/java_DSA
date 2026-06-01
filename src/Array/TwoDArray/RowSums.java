package Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

/*
    Q) Find the sum of Each row in 2D array.
    Time complexity : O(n^2)
    Space Complexity : O(n)
    Difficulty level : Easy
 */
public class RowSums {
    private static List<Integer> sum(int[][] arr){
        List<Integer> ans = new ArrayList<>();

        int r = arr.length;
        int c = arr[0].length;

        for (int row = 0; row < r; row++){
            int sum = 0;
            for (int col = 0; col < c; col++){
                sum+=arr[row][col];
            }
            ans.add(sum);
        }

        return ans;
    }
    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(arr));
    }
}
