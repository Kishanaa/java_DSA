package leetCode;

public class SingleElement540 {
    static int singleNonDuplicate(int[] nums) {
        int ans = 0;
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (moveCondition(nums,mid)){
                ans = mid;
                start = mid + 1;
            }else{

                end = mid - 1;
            }
        }

        return nums[ans];
    }

    private static boolean moveCondition(int[] nums, int mid) {
        boolean move = true;

        if (mid+1 < nums.length && nums[mid+1]==nums[mid]){
            if ((mid+1)%2==0){
                move = false;
            }
        }
        if (mid-1>=0 && nums[mid-1]==nums[mid]){
            if ((mid-1)%2!=0){
                move = false;
            }
        }

        return move;
    }

    static void main() {
        int[] nums = {1,1,2,3,3,4,4,5,5};
        System.out.println(singleNonDuplicate(nums));
    }
}
