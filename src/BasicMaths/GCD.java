package BasicMaths;

import java.util.Scanner;

/*
    Q) Find the GCD of a number
    Difficulty level - Medium (Coding - Easy, Thinking of math solution - Medium)
 */
public class GCD {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2st number: ");
        int num2 = sc.nextInt();

        while (num2!=0){
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        System.out.println(num1);
    }
}
