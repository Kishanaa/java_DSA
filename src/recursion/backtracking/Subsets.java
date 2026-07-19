package recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static List<List<Integer>> subsets(int[] nums) {
        int index = 0;
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,index,output,ans);
        return ans;
    }
    static void solve(int[] nums, int index, List<Integer> output, List<List<Integer>> ans){
        if (index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        int currVal = nums[index];
//        Include
        output.add(currVal);
        solve(nums,index+1, output, ans);
//        Backtracking
        output.remove(output.size()-1);
        solve(nums, index+1, output, ans);

    }
    static void main() {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
}
