package Array;

public class MultiplyByTen {
    static void main() {
        int[] arr = {5,6,2,3,4,8,1,2};
        int[] arr10 = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            arr10[i]=arr[i]*10;
        }
        for (int i : arr10){
            System.out.print(i+" ");
        }
    }
}
