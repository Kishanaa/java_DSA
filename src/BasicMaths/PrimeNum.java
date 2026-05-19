package BasicMaths;

import java.util.Scanner;

public class PrimeNum {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int dupNum = 2;
        boolean isPrime = true;

        if (num <= 1){
            System.out.println("Neither prime nor composite");
        } else {
            while (dupNum*dupNum<=num){
                if (num%dupNum==0){
                    isPrime = false;
                    break;
                }
                dupNum++;
            }
            System.out.println(isPrime);
        }



    }
}
