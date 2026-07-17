package recursion;

public class SubsequenceWithSumK {
    static boolean checkSubsequenceSum(int[] arr, int k) {

        boolean ans = checking(arr,k,0,0);
        return ans;

    }
    static boolean checking(int[] arr, int k, int index, int sum){

        if (index >= arr.length){
            if (sum==k){
                return true;
            }else{
                return false;
            }
        }

        boolean exclude = checking(arr, k, index+1, sum);
        boolean include = checking(arr, k, index+1, sum+arr[index]);

        if (include || exclude){
            return true;
        }else {
            return false;
        }
    }
    static void main() {
        int[] arr ={2, 3, 5, 7, 9};
        int k = 100;
        System.out.println(checkSubsequenceSum(arr,k));
    }
}
