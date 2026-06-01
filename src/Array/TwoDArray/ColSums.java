package Array.TwoDArray;

import java.util.ArrayList;
import java.util.List;
/*
    Q) Find the sum of Each column in 2D array.
    Time complexity : O(n^2)
    Space Complexity : O(n)
    Difficulty level : Easy
    method1, may be slightly better for performance due to row-wise traversal in memory
 */
public class ColSums {
    private static void method1(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        int[] sum = new int[c];

        for (int row = 0; row < r; row++){
            for (int col = 0; col < c; col++){
                sum[col]+=arr[row][col];
            }
        }
        for (int num : sum){
            System.out.println(num);
        }
    }

    private static List<Integer> method2(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        int r = arr.length;
        int c = arr[0].length;


        for (int col = 0; col < c; col++){
            int sum = 0;
            for (int row = 0; row < r; row++){
                sum+=arr[row][col];
            }
            ans.add(sum);
        }
        return ans;
    }

    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        method1(arr);
        System.out.println(method2(arr));
    }
}
