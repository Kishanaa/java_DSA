package String;

public class ReplaceAllOccurrenceOfAStringWithSpace {
    static String replace(String s, String sub){

        while(s.contains(sub)){

            int index = s.indexOf(sub);

            s = s.substring(0, index) + s.substring(index+ sub.length());

        }


        return s;
    }
    static void main() {
        String s = "LIELIEILIEAMLIECOOL";
        String sub = "LIE";

        System.out.println(replace(s, sub));
    }
}
