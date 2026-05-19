package BasicMaths;

import java.util.Scanner;

public class CountDigitOfNum {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to count: ");
        int num = sc.nextInt();
        int count = 0;

        while (num != 0){
            num=num/10;
            count++;
        }

        System.out.println("Count of Digit is: "+ count);

    }
}
