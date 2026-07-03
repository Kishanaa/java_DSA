package recursion;

public class HouseRobber {
    static int solve(int[] nums, int index){
        if (index >= nums.length){
            return 0;
        }

        int includeAns = nums[index] + solve(nums, index+2);
        int excludeAns = 0 + solve(nums, index+1);
        int finalAns = Math.max(includeAns, excludeAns);
        return finalAns;
    }
    static void main() {
        int[] arr = {1,2,3,1};
        int index = 0;
        System.out.println(solve(arr, index));
    }
}
