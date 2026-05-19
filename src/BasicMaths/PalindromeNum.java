package BasicMaths;

import java.util.Scanner;

public class PalindromeNum {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int revNum = 0, originalNum = num;

        while (num!=0){
            int temp;
            temp = num%10;
            revNum = revNum*10+temp;
            num=num/10;
        }
        if (revNum==originalNum){
            System.out.println("Entered number is a palindrome");
        }else {
            System.out.println("Entered number is not a palindrome");
        }
    }
}
