package Array;

import java.util.Scanner;

public class FindElement {
    static void main() {
        int[] arr = {5,6,2,3,4,8,1,2};
        System.out.println("Enter number to find: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++){
            if (num == arr[i]){
                System.out.println("Element found at "+i+" index");
                return;
            }
        }
    }
}
