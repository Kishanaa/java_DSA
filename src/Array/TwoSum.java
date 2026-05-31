package Array;

import java.util.Scanner;

public class TwoSum {
    private static void sum(int[] arr, int target){
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (target==arr[i]+arr[j]){
                    System.out.println(arr[i] + " + " + arr[j]);
                    return;
                }
            }
        }
    }
    static void main() {
        int[] arr = {-1,-2,-3,-4,-5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        sum(arr,target);
    }
}
