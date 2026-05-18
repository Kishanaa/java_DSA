package PatternPrintingProblem;

public class NumberPyramid {
    static void main() {

        int n = 5;
        for (int i = 1; i < n; i++){
            for (int j = 1; j < n-i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j < i*2-1; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
