package leetCode;
    // sliding window technics

public class PermutationInString567 {
    static boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();

        if (s1Length > s2Length){
            return false;
        }

        int[] s1Arr = new int[26];
        for (int i = 0; i < s1Length; i++){
            int index = s1.charAt(i) - 'a';
            s1Arr[index]++;
        }

        int i = 0;
        int[] s2Arr = new int[26];
        int windowLength = s1Length;
        for (i = 0; i < windowLength; i++){
            int index = s2.charAt(i) - 'a';
            s2Arr[index]++;
        }

        if (condition(s1Arr,s2Arr)){
            return true;
        }else{
            while (i < s2Length){
                int newCharIndex = s2.charAt(i) - 'a';  // i is already 3
                s2Arr[newCharIndex]++;

                int oldCharIndex = s2.charAt(i - windowLength) - 'a';
                s2Arr[oldCharIndex]--;

                if (condition(s1Arr, s2Arr))
                    return true;

                i++;
            }
        }

        return false;
    }

    private static boolean condition(int[] s1Arr, int[] s2Arr) {
        for (int i = 0; i < s1Arr.length; i++){
            if (s1Arr[i]!=s2Arr[i]){
                return false;
            }
        }
        return true;
    }

    static void main() {
        String s2 = "eidboaoo";
        String s1 = "ab";

        System.out.println(checkInclusion(s1, s2));
    }
}
