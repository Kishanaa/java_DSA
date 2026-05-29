package Array;
/*
    Q) Print extreme elements in an alternate manner
    Time - O(n)
    space - O(1)
    Difficulty - Easy
 */
public class ExtremeEleAlternate {
    private static void print(int[] arr){
        int n = arr.length-1;
        int i = 0;
        while (i<=n){
            if (i==n){
                System.out.println(arr[i]);
                return;
            }
            System.out.println(arr[i]+" "+arr[n]);
            i++;
            n--;
        }
    }
    static void main() {
        int[] arr = {5,6,2,3,2,4,8,1,2};
        print(arr);
    }
}
