package Array;

public class CountZeroOne {
    static void main() {
        int[] arr = {0,1,1,0,1,1,1};

        int zeroCount = 0 ,oneCount = 0;

        for (int i : arr){
            if (i==0){
                zeroCount++;
            } else if (i==1) {
                oneCount++;
            }
        }
        System.out.println("Zero Count: "+ zeroCount);
        System.out.println("One Count: "+ oneCount);
    }
}
