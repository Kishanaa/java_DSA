package recursion;

public class BinarySearch {
    static int binarySearch(int[] arr,int target, int start, int end){

        int mid = start + (end - start)/2;

        if (arr[mid]==target){
            return mid;
        }
        if (start>end){
            return -1;
        }
        if (arr[mid] < target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }

        return binarySearch(arr, target, start, end);
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,15,16,18,20};
        int ans = binarySearch(arr,9,0, arr.length-1);
        System.out.println(ans);
    }
}
