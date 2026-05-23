package BasicMaths;

import java.util.Scanner;

public class SumOfNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int sum =0;

        for (int i = 1; i <= num; i++){
            sum+=i;
        }
        System.out.println("Sum of "+num+" numbers is: " + sum);
    }
}
