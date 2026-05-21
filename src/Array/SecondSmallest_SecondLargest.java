package Array;

public class SecondSmallest_SecondLargest {
    static void main() {
        int arr[] = {-1,6,2,3,4,8,1,7};

//      Part 1 --> Second Smallest
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;    // Returns the largest possible int value in Java this helps for negative number

        for (int i : arr){
            if (smallest > i){
                secondSmallest = smallest;
                smallest = i;
            } else if (smallest < i && secondSmallest > i) {
                secondSmallest = i;
            }
        }

        System.out.println("Second Smallest number: "+ secondSmallest);


//        Part 2 --> Second Largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr){
            if (largest < i){
                secondLargest = largest;
                largest = i;
            } else if (largest > i && secondLargest < i) {
                secondLargest = i;
            }
        }


        System.out.println("Second Largest number: "+ secondLargest);
    }
}
