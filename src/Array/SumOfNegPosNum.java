package Array;

public class SumOfNegPosNum {
    static void main() {
        int[] arr = {2,-3,-1,4,6,-9};

        int posSum = 0 ,negSum = 0;

        for (int i : arr){
            if (i>0){
                posSum+=i;
            }else {
                negSum+=i;
            }
        }
        System.out.println("Sum of +number: "+ posSum);
        System.out.println("Sum of -number: "+ negSum);
    }
}
