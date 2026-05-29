package Array;

public class FirstUnsortedEle {
    private static int unsorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i+1]<arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }
    static void main() {
        int[] arr = {1,2,3,4,5,2,6,7,8};
        System.out.println(unsorted(arr));
    }
}
