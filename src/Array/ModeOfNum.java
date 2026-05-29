package Array;

import java.util.HashMap;


/*
    Q) Find Mode of array
    Time Complexity - O(n)
    Space complexity - O(n)
    Difficulty level - Medium to Hard
 */

public class ModeOfNum {


    static void mode(HashMap<Integer,Integer> freq){

        int maxFreq = -1;
        int maxFreqKey = -1;

        for (int key : freq.keySet()){
            int currentFreq = freq.get(key);
            if (currentFreq > maxFreq){
                maxFreq = currentFreq;
                maxFreqKey = key;
            }
        }

        System.out.println("Mode of this array is: "+ maxFreqKey);
    }

    static void method2(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int i : arr){
            freq.put(i , freq.getOrDefault(i, 0) + 1);
        }
        System.out.println("Frequencies are "+freq);
        mode(freq);
    }
    static void main() {
        int[] arr = {1,1,2,2,2,3,3,3,3,4,4};

        method2(arr);
    }
}
