package Array;

import java.util.Arrays;

/*
    Q) Given an unsorted array, find the median of the given array.
    Difficulty level - Easy
 */

public class MedianOfNum {
    static void main() {
        int[] arr = {5,6,2,3,4,8,1,2};
        int i = arr.length;

        Arrays.sort(arr);

        if (i%2==0){
            int firstM = arr[i/2-1];
            int secondM = arr[i/2];
            double median = (double) (firstM + secondM) /2;
            System.out.println("Median: "+median);
        }else {
            System.out.println("Median: "+arr[i/2]);
        }
    }
}
