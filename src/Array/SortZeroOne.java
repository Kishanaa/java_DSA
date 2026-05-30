package Array;

public class SortZeroOne {

    private static void sort(int[] arr){
        int right = arr.length-1;
        int left = 0;

        while (left < right){
            if (arr[left]==1 && arr[right]==0){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            } else if (arr[left]==1 && arr[right]==1) {
                right--;
            } else {
                left++;
            }
        }
        for (int i : arr){
            System.out.print(i +" ");
        }
    }
    static void main() {
        int[] arr = {0,1,1,0,1,0};
        sort(arr);
    }
}
