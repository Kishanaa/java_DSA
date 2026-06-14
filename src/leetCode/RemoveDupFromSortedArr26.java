package leetCode;
/*
    Problem no : 26
    TC : O(n)
    SC : O(1)
 */
public class RemoveDupFromSortedArr26 {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    static void main() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n = removeDuplicates(nums);
        for (int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
