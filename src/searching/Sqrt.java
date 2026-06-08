package searching;

import java.util.Scanner;

public class Sqrt {

    static double nearSqrt(int num, int precision){
        
        int start = 0;
        int end = num;
        int mid;
        int ans = 0;
        
        while (start<=end){
            mid = start + (end - start)/2;
            if (mid*mid == num){
                return mid;
            } else if (mid*mid > num) {
                end = mid - 1;
            }else{
                ans = mid;
                start = mid + 1;
            }
        }
        return sqrt(ans,num,precision);

    }

    static double sqrt(double num, int target, int precision){
        double factor = 1;

        for (int i = 0; i < precision; i++){
            factor = factor / 10.0;

            for (double j = 1; j <= 9; j++){
                double newAns = num + factor;

                if(newAns * newAns <= target){
                    num = newAns;
                }else{
                    break;
                }
            }
        }
        return num;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println(nearSqrt(56,6));
    }
}
