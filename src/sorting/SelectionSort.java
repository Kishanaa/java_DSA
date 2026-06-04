package sorting;

public class SelectionSort {
    public static void selection(int[] arr){
        int minValIndex;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            minValIndex = i;
            for (int j = i; j < n; j++){
                if (arr[minValIndex]>arr[j]){
                    minValIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minValIndex];
            arr[minValIndex] = temp;
        }
    }
    static void main() {
        int[] arr = {5,4,1,2,6};
        selection(arr);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
