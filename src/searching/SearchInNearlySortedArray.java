package searching;

public class SearchInNearlySortedArray {
    static int findTarget(int arr[], int target) {
        // code here
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            } else if (mid-1 >= 0 && arr[mid-1] == target) {
                return mid-1;
            } else if (mid+1 <= arr.length-1 && arr[mid+1] == target) {
                return mid+1;
            }
            if (arr[mid]>target){
                end = mid -2;   // because -1 we already checked
            }else{
                start = mid +2; // because +1 we already checked
            }
        }
        return -1;

    }
    static void main() {
        int[] arr = {10, 3, 40, 20, 50, 80, 70};
        int k = 3;

        System.out.println(findTarget(arr,k));
    }
}
