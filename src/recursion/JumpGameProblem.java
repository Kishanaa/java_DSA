package recursion;

public class JumpGameProblem {
    static boolean canJump(int[] nums, int i) {

        if (i == nums.length-1){
            return true;
        }
        if (i> nums.length){
            return false;
        }
        if (nums[i] == 0){  // this is lower because first check i is not out of BoundsException
            return false;
        }


        boolean ans = false;
        for (int j = 1; j <= nums[i]; j++){
            ans = ans || canJump(nums, i+j);
        }

        return ans;
    }
    static void main() {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums,0));
    }
}
