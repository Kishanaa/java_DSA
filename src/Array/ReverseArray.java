package Array;
/*
    Q) Reverse the array and print it.
    Difficulty level - Easy
 */
public class ReverseArray {

    static void main() {

        int arr[] = {1,2,3,4,5,6};

        int n = arr.length;

        for (int i = 0; i <= n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
