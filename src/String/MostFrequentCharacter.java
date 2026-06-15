package String;

public class MostFrequentCharacter {
    static char getMax(String s){
        // code here
        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i) - 'a';
            freq[ch]++;
        }

        int maxFreq = -1;
        char ans = 'a';

        for(int i = 0; i < freq.length; i++){
            if(maxFreq < freq[i]){
                maxFreq = freq[i];
                ans = (char) (i + 'a');
            }
        }


        return ans;
    }
    static void main() {
        String st = "testsample";

        System.out.println(getMax(st));

    }
}
