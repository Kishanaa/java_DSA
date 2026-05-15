/*
Q) Check Armstrong numbers from 100 to 999.
    Difficulty level - Easy
 */


public class ArmstrongNumber {
    static void main(String[] args) {

        int a,b,c;
        int temp;

        for (a=100; a<=999; a++){
            c=a;
            b=0;
            while (c!=0){
                temp = c%10;
                c=c/10;
                b+=temp*temp*temp;
            }
            if (a==b){
                System.out.println(a);
            }
        }

    }
}
