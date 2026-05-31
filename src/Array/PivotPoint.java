package Array;
/*
    Q) Find Pivot Point of a given array.
    Time Complexity : O(n)
    Space Complexity : O(1)
    Difficulty level : Easy to Medium
 */
public class PivotPoint {
    private static int point(int[] arr){
        int rightSum = 0;
        int leftSum = 0;

        for (int num : arr){
            rightSum += num;
        }
        for (int num : arr) {
            rightSum -= num;

            if (leftSum == rightSum) {
                return num;
            }
            leftSum += num;
        }
        return -1;
    }
    static void main() {
        int[] arr = {12,19,2,-20,6,14,-1};
        System.out.println(point(arr));
    }
}
