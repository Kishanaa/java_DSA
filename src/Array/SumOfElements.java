package Array;

public class SumOfElements {
    static void main() {
        int[] arr = {5,6,2,3,4,8,1,2};

        int sum = 0;

        for (int i :arr){
            sum+=i;
        }
        System.out.println("sum of all the elements in the array: "+ sum);
    }
}
