package Array;

public class MinimumValue {
    static void main() {
        int arr[] = {20,50,10,30,40};
        int mini = arr[0];

        for (int i : arr){
            if (mini>i){
                mini=i;
            }
        }
        System.out.println("Minimum value is: "+ mini);
    }
}
