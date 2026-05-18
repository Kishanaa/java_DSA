package String;
/*
    This approach is not efficient because strings in Java are immutable.
    Each time you do    revStr = revStr.concat(...)
    a new string object is created. So for large strings, performance becomes slower.
    But for now I am using this because I don't want to use StringBuilder.

    Difficulty Level - Easy
 */

public class ReverseString {
    static void main() {

        String str = "My name is Kishan";
        String revStr="";

        for (int i = str.length()-1; i >= 0; i--){
            revStr = revStr.concat(String.valueOf(str.charAt(i)));
        }
        System.out.println(revStr);
    }
}
