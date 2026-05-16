package PatternPrintingProblem;

public class RhombusPattern {
    static void main() {
        int n = 4;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 4; j++){
                System.out.print("* ");
            }
            n--;
            System.out.println();
        }
    }

}
