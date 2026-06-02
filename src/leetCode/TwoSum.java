package leetCode;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
    static void main() {
        int[] arr = {1,2,1,1,5,1};
        int target = 7;
        int[] ans = twoSum(arr,target);

        System.out.print("indices of the two numbers: ");
        for (int num : ans){
            System.out.print(num+" ");
        }

    }
}
