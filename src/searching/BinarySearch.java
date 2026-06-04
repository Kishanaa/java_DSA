package searching;

public class BinarySearch {
    public static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid ;

        while (start<=end){

            mid = start + (end - start)/2;

            if (arr[mid]==target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }
    static void main() {
        int[] arr = {10,20,30,40,50,60,70,80,99};
        System.out.println("Index: " + binary(arr,80));;
    }
}
