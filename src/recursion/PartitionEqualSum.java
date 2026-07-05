package recursion;

public class PartitionEqualSum {
    static int canPartition(int[] nums, int sum, int index) {

        if (sum == 0){
            return 1;
        }

        if (index >= nums.length){
            return 0;
        }


        if (sum < 0){
            return 0;
        }

        int includeAns = canPartition(nums, sum-nums[index], index+1);
        int exclude = canPartition(nums, sum, index+1);

        if (includeAns == 1 || exclude == 1){
            return 1;
        }else {
            return 0;
        }
    }
    static void main() {
        int[] arr = {1,2,3,5};
        int sum = 0;
        for (int value : arr){
            sum+=value;
        }
        if (sum%2!=0){
            System.out.println(false);
        }else {
            sum=sum/2;
            System.out.println(canPartition(arr, sum, 0));
        }

    }
}
