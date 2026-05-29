package Array;
/*
    Q) Reverse the array and print it.
    I already solved this question using a for loop, but now I am solving it using the two-pointer approach
 */
public class ReverseArray2P {
    private static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        for (int k : arr){
            System.out.print(k+" ");
        }
    }
    static void main() {
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr);
    }
}
