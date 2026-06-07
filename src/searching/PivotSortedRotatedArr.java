package searching;

public class PivotSortedRotatedArr {
    public static void pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        int ans = arr.length - 1;


        while (start<end){
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]){
                start = mid + 1;
                ans = start;
            }else {
                end = mid;
                ans = end;
            }
        }
        System.out.println(ans);

    }
    static void main() {
        int[] arr = {-66,-67};
        pivot(arr);

    }
}
