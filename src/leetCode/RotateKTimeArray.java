package leetCode;

public class RotateKTimeArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }
    private static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
