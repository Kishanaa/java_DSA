package leetCode;

public class RemoveAllAdjacentDupInString1047 {
    static String method1(String s) {
        int windowLength = 2;
        int i = 0;
        while (i < s.length()-1){
            char previousChar = s.charAt(i);
            char nextChar = s.charAt(i+1);

            if (previousChar == nextChar){
                s = s.substring(0 , i) + s.substring(i+windowLength);
                if (i > 0) {
                    i--;
                }
            }else{
                i++;
            }
        }

        return s;
    }
    static String removeDuplicates(String s) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if (newString.length() > 0 && newString.charAt(newString.length()-1) == ch){
                newString.deleteCharAt(newString.length()-1);
            }else {
                newString.append(ch);
            }
        }

        return newString.toString();
    }
    static void main() {
        String s = "abbaca";
        System.out.println(method1(s));
        System.out.println(removeDuplicates(s));
    }
}
