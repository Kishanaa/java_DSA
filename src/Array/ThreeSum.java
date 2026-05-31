package Array;

import java.util.*;

/*
    Q) find all triplets whose sum is equal to the target. Note that not any duplicate triplets exists.
    Time Complexity: O(n³)
    Space Complexity: O(1)
    Difficulty level - Easy
 */

public class ThreeSum {
    private static List<List<Integer>> threeSum(int[] arr, int target){

        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                for (int k = j+1; k < arr.length; k++){
                    if (target==arr[i]+arr[j]+arr[k]){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }
    static void main() {

        int[] arr = {-1,0,1,2,-1,-4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        System.out.println(threeSum(arr,target));
    }
}
