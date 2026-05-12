import java.util.Scanner;

public class CaseCheck {
    static void main() {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case");
        } else {
            System.out.println("not a letter");
        }
    }
}
