package searching;

public class NoOfOccurrence {
    public static int lowerBound(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;

        while(start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid] >= target){
                ans = mid;
                end = mid -1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // If no element is greater than target,
        // upper bound will be arr.length
        int ans = arr.length;

        while (start<=end){
            int mid = start + (end - start)/2;

            if (arr[mid] <= target){
                // Search in the right half
                start = mid + 1;
            } else{
                // Found an element greater than target
                // It is a candidate for the upper bound
                ans = mid;
                // Try to find an even smaller valid index
                end = mid - 1;
            }
        }
        // Index of the first element greater than target
        return ans;
    }
    static void main() {
        int[] arr = {10,20,30,50,50,50,60,70,80,80,80,80,80,99};
        int lower = lowerBound(arr, 80);
        int upper = upperBound(arr, 80);
        System.out.println(upper-lower);
    }

}
