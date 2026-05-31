package Array;
/*
    Q) Remove duplicates from a sorted array and keep only unique elements.
    Time Complexity - O(N)
    Space Complexity - O(1)
    Difficulty level - Easy to Medium
 */
public class RemoveDupFromSortArr {
    private static void remove(int[] arr){
        int i = 0;
        int j = 1;
        int n = arr.length;

        while (j<n){
            if (arr[i]==arr[j]){
                j++;
            }else {
                i++;
                arr[i]=arr[j];
                j++;
            }
        }

        for (int k = 0; k <= i; k++){
            System.out.print(arr[k]+" ");
        }
    }
    static void main() {
        int[] arr = {1,2,2,3,3,3,4,5,5,6};
        remove(arr);
    }
}
