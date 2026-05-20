package BasicMaths;

import java.util.Scanner;

public class PerfectNumber {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number");
//        perfect numbers 6,28,...
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 2; i*i <= n; i++){
            if (n%i == 0){
//                i se n ko perfectly divide kar dia hai
//                1st factor i
//                2nd factor n/i
                int firstFactor = i;
                int secondFactor = n/i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if (sum==n){
            System.out.println("Perfect number");
        }else {
            System.out.println("Not Perfect number");
        }
    }


}
