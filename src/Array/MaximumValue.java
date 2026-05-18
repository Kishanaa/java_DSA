package Array;

public class MaximumValue {
    static void main() {
        int arr[] = {10,50,20,30,40};
        int max = arr[0];
        for (int i : arr){
            if (max<i){
                max=i;
            }
        }
        System.out.println("Maximum number is: "+max);
    }
}
