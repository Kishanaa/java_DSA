package recursion;

public class MinimizeTheDifference {

    static int minimizeTheDifference(int[][] mat, int target, int m, int sum){

        if (m >= mat.length){
            return Math.abs(target - sum);
        }
        int returnAns ;
        int ans = Integer.MAX_VALUE;
        for (int num : mat[m]){
            returnAns = minimizeTheDifference(mat,target,m+1,sum+num);
            ans = Math.min(ans, returnAns);
        }

        return ans;
    }
    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 13;
        System.out.println(minimizeTheDifference(arr,target,0,0));
    }
}
