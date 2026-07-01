package String;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AllSubsequences {
    static List<String> subsequences(String s){
        List<String> ans = new ArrayList<>();
        int i = 0;
        StringBuilder output = new StringBuilder();
        getAllSubSeq(s,i,output,ans);
        Collections.sort(ans);
        return ans;
    }

    private static void getAllSubSeq(String s, int i, StringBuilder output, List<String> ans) {
        if (i>=s.length()){
            String subSeq = output.toString();
            ans.add(subSeq);
            return;
        }
        output.append(s.charAt(i));
        getAllSubSeq(s,i+1,output,ans);
        output.deleteCharAt(output.length()-1);
        getAllSubSeq(s,i+1,output,ans);
    }

    static void main() {
        String s = "abc";
        System.out.println(subsequences(s));
    }
}
