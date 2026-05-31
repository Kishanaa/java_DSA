package Array;

import java.util.HashMap;
/*
    Q) Find First Repeated element in given array.
    Time Complexity  : O(n)
    Space Complexity : O(n)
    Difficulty level : Easy
 */
public class FindFirstRepeated {
    private static int firRep(int[] arr){
        HashMap<Integer,Integer> rep = new HashMap<>();
        for (int i : arr){
            rep.put(i, rep.getOrDefault(i,0)+1);
        }
        for (int temp : arr) {
            if (rep.get(temp) > 1) {
                return temp;
            }
        }
        return -1;
    }
    static void main() {
        int[] arr = {5,1,4,2,4,7,2};
        System.out.println(firRep(arr));
    }
}
