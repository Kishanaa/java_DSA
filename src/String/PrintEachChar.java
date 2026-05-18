package String;

public class PrintEachChar {
    static void main() {

//        1st method
        System.out.println("1nd Method");
        String str = "My name is kishan";
        char[] charArray = str.toCharArray();
        for (char ch : charArray){
            System.out.println(ch);
        }


//        2nd method
        System.out.println("2nd Method");
        String str2 = "Kishan";
        for (int i = 0; i < str2.length(); i++){
            System.out.println(str2.charAt(i));
        }
    }
}
