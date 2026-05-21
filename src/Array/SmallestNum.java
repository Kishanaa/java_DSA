package Array;

public class SmallestNum {
    static void main() {
        int arr[] = {5,6,2,3,4,8,1,2};

        int smallestNum = arr[0];

        for (int i : arr){
            if (smallestNum > i){
                smallestNum=i;
            }
        }
        System.out.println("Smallest number in array: "+ smallestNum);
    }
}
