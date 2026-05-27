package Array;

public class AverageOfNum {
    static void main() {
        int[] arr = {1,2,1,1,5,1};
        int i = arr.length;

        int sum = 0;

        for (int a : arr){
            sum+=a;
        }

        System.out.println("Average of array: "+ (double)sum/i);
    }
}
