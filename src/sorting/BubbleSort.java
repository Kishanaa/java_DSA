package sorting;

public class BubbleSort {
    public static void bubble(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void main() {
        int[] arr = {5,4,1,2,6,1};
        bubble(arr);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
