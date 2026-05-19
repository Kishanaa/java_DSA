package BasicMaths;

import java.util.Scanner;

public class SumOfDigit {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0){
            int temp;
            temp = num % 10;
            sum += temp;
            num = num/10;
        }
        System.out.println("Sum of digit: "+ sum);
    }
}
