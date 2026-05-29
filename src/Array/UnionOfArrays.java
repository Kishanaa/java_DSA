package Array;

import java.util.HashSet;

/*
    Q) Find Union of two arrays
    Time complexity - O(n)
    Space complexity - O(n)
    Difficulty level - Easy
 */

public class UnionOfArrays {

    private static void union(int[] arr1, int[] arr2){
        HashSet<Integer> unionSet = new HashSet<>(); // HashSet automatically remove duplicate elements

        for (int i : arr1){
            unionSet.add(i);
        }
        for (int i : arr2){
            unionSet.add(i);
        }

        System.out.println(unionSet);
    }
    static void main() {
        int[] arr1 = {1,2,3,4,7};
        int[] arr2 = {1,6,3,4,5,15};

        union(arr1,arr2);
    }
}
