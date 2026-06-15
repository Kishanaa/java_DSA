package leetCode;

public class ReverseWords151 {
    static String reverseWords(String st){
        StringBuilder newSt = new StringBuilder();
        int n = st.length() - 1;

        int starting = n;
        int ending = n;

        while (starting >= 0){

            // remove spaces
            while ( ending >= 0 && st.charAt(ending)==' '){
                ending--;
            }
            if (ending < 0){
                break;
            }
            starting = ending;
            while (starting >= 0 && st.charAt(starting) != ' '){
                starting--;
            }
            newSt.append(st.substring(starting+1,ending+1));

            // remove spaces
            while (starting >= 0 && st.charAt(starting)==' '){
                starting--;
            }
            if (starting >= 0){
                newSt.append(" ");
            }
            ending = starting;
        }

        return newSt.toString();
    }
    static void main() {
        String st = "  hello world  ";
        System.out.println(reverseWords(st));;
    }
}
