package BasicMaths;

import java.util.Scanner;

public class EvenOrOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i%2==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }
}
