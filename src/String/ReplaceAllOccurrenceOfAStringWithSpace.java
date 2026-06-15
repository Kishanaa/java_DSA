package String;

public class ReplaceAllOccurrenceOfAStringWithSpace {
    static String replace(String s, String sub){

        s = s.replace(sub," ");

        s = s.trim();

        return s;
    }
    static void main() {
        String s = "LIELIEILIEAMLIECOOL";
        String sub = "LIE";

        System.out.println(replace(s, sub));
    }
}
