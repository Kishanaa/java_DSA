package String;

public class CountVowels {
    static void main() {

        String str = "My name is Kishan";
        str = str.toLowerCase();

        char[] charArray = str.toCharArray();
        int sum = 0;

        for (char ch : charArray){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sum++;
            }
        }
        System.out.println("Vowel count: "+ sum);
    }
}
