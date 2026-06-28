package leetCode;

public class FibonacciNumber509 {
    static int fib(int n){

        if (n == 1){
            return 1;
        }
        if (n == 0){
            return 0;
        }
        return fib(n - 1) + fib(n - 2);
    }
    static void main() {
        int num = 5;
        System.out.println(fib(num));
    }
}
