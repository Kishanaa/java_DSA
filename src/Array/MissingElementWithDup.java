package Array;

import java.util.ArrayList;
/*
    Q) Find Missing Elements from an Array with duplicates.
    Method 1: Boolean Array
        Time Complexity : O(n)
        Space Complexity : O(n)
    Method 2: Negative Marking
        Time Complexity : O(n)
        Space Complexity : O(1)
 */
public class MissingElementWithDup {
    private static ArrayList<Integer> method1(int[] arr, int n){

        ArrayList<Integer> ans = new ArrayList<>();

        boolean[] num = new boolean[n];

        for (int j : arr) {
            num[j-1] = true;
        }

        for (int b = 0; b < num.length; b++ ){
            if (!num[b]){
                ans.add(b+1);
            }
        }

        return ans;
    }

    private static ArrayList<Integer> method2(int[] arr){

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if (arr[Math.abs(arr[i])-1] < 0){
                continue;
            }
            int temp = -arr[Math.abs(arr[i])-1];
            arr[Math.abs(arr[i])-1] = temp;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }
    static void main() {
        int[] arr = {8,2,1,10,9,4,6,5,4,6};
        System.out.println(method1(arr, 10));
        System.out.println(method2(arr));
    }
}
