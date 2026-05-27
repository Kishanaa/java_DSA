package Bitwise;

import java.util.Scanner;

public class PowerOfTwo {

    private static boolean methodOne(int num){
        if ((num&(num-1))==0){
            return true;
        }else {
            return false;
        }
    }

    private static boolean methodTwo(int num){
        int sum = 0;
        while (num!=0){
            if ((num&1)==1){
                sum++;
            }
            num=num>>1;
        }

        if (sum==1){
            return true;
        }else {
            return false;
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Method 1 answer: " + methodOne(num));
        System.out.println("Method 2 answer: " + methodTwo(num));

    }
}
