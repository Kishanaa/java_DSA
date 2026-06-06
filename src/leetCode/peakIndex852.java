package leetCode;

public class peakIndex852 {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
                ans = start;
            }else{
                end = mid;
                ans = end;
            }
        }
        return ans;
    }
    static void main() {
        int[] nums = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(nums));
    }
}
