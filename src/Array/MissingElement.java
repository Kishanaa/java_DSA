package Array;
/*
    Q) Given an array containing n distinct numbers from 0 to n, find the missing number.
    Difficulty level - Easy with method 1 and Hard to understand using Method 2
    Time complexity - O(n)
    Space Complexity - O(1)
 */
public class MissingElement {

    private static void Method1(int[] arr){
        int arrSum = 0;
        int sum = 0;
        for (int i = 0; i <= arr.length; i++){
            sum+=i;
            if (i<arr.length){
                arrSum+=arr[i];
            }
        }
        System.out.println("Missing number using Method 1: "+(sum-arrSum));
    }
    private static void Method2(int[] arr){
        int xorSum = 0;

        for (int i : arr){
            xorSum = xorSum ^ i;
        }

        for (int i = 0; i <= arr.length; i++){
            xorSum = xorSum ^ i;
        }
        System.out.println("Missing number using Method 2: "+xorSum);
    }
    static void main() {
        int[] arr = {2,4,1,3,0};
        Method1(arr);
        Method2(arr);

    }
}
