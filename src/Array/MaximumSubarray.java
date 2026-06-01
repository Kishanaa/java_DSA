package Array;

/*
    Q) Maximum sum of any contiguous subarray. It uses Kadane’s Algorithm which is very famous in interviews
    Time Complexity : O(n)
    Space Complexity : O(1)
    Difficulty level : Easy
 */

public class MaximumSubarray {
    private static void subarray(int[] arr){
        int maxSum = Integer.MIN_VALUE, sum =0;

        for (int num: arr){
            sum += num;
            maxSum = Math.max(maxSum, sum);

            if (sum < 0){
                sum = 0;
            }
        }

        System.out.println(maxSum);
    }

    static void main() {
        int[] arr = {1,-2,3,4,5};
        subarray(arr);
    }
}
