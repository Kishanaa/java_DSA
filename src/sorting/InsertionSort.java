package sorting;

public class InsertionSort {
    public static void insertion(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int currentVal = arr[i];
            int previousVal = i-1;
            while (previousVal>=0 && currentVal < arr[previousVal]){
                if (currentVal < arr[previousVal]){
                    arr[previousVal+1] = arr[previousVal];
                }
                previousVal--;
            }
            arr[previousVal+1] = currentVal;
        }
    }
    static void main() {
        int[] arr = {5,4,1,2,6};
        insertion(arr);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
