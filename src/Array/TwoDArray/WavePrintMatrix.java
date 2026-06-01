package Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;

/*
    Q) column-wise wave traversal of 2D array.
    Time complexity : O(n^2)
    Space complexity : O(n^2)
    Difficulty level : Easy
 */
public class WavePrintMatrix {
    private static List<Integer> wave(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        int r = arr.length;
        int c = arr[0].length;
        for (int col = 0; col < c; col++){
            if ((col&1)==0){
                for (int row = 0; row < r; row++){
                    ans.add(arr[row][col]);
                }
            }else {
                for (int row = r-1; row >= 0; row--){
                    ans.add(arr[row][col]);
                }
            }
        }

        return ans;
    }
    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(wave(arr));
    }
}
