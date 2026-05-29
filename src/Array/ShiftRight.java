package Array;

public class ShiftRight {

    private static void shift(int[] arr){
        int n = arr.length;
        int last = arr[n-1];
        for (int i = n-1; i > 0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;

        for (int i: arr){
            System.out.print(i+" ");
        }
    }
    static void main() {
        int[] arr = {10,20,30,40,50};
        shift(arr);
    }

}
