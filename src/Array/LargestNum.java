package Array;

public class LargestNum {
    static void main() {
        int arr[] = {5,6,2,3,4,8,1,2};

        int largestNum = arr[0];

        for (int i : arr){
            if (largestNum < i){
                largestNum =i;
            }
        }
        System.out.println("Largest number in array: "+ largestNum);
    }
}
