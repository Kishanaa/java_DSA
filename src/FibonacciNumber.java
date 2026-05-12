public class FibonacciNumber {
    static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int loop = 7;
        for (int i = 0; i < loop; i++){
            int temp = b;
            b+=a;
            a=temp;
            System.out.println(b);
        }
    }
}
