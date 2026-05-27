package Bitwise;

import java.util.Scanner;
/*
    Q) Previously we used modulus to get even odd but modulus is heavy so now we are using bitwise AND to perform the task
 */
public class EvenOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if ((num&1)==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
