package Array;

import java.util.HashMap;

/*
    Q) Find highest and lowest frequency numbers
    Time Complexity - O(n)
    Space Complexity - O(n)
    Difficulty level - High
 */

public class HighestLowFreq {

    static void highestFreq(HashMap<Integer,Integer> freq){
        int maxFreq = -1;
        int maxFreqKey = -1;

        for (int key : freq.keySet()){
            int currentFreq = freq.get(key);

            if (maxFreq < currentFreq){
                maxFreq = currentFreq;
                maxFreqKey = key;
            }
        }
        System.out.println("Number with Highest Freq: " + maxFreqKey +"-"+ maxFreq);
    }
    static void lowestFreq(HashMap<Integer,Integer> freq){
        int lowFreq = Integer.MAX_VALUE;
        int lowFreqKey = Integer.MAX_VALUE;

        for (int key : freq.keySet()){
            int currentFreq = freq.get(key);

            if (lowFreq > currentFreq){
                lowFreq = currentFreq;
                lowFreqKey = key;
            }
        }
        System.out.println("Number with Lowest Freq: " + lowFreqKey +"-"+ lowFreq);
    }
    static void freq(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int i : arr){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        highestFreq(freq);
        lowestFreq(freq);
    }
    static void main() {
        int[] arr = {1,1,2,2,2,3,3,3,3,4,};
        freq(arr);
    }
}
