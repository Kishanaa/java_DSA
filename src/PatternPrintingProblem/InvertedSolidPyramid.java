package PatternPrintingProblem;

public class InvertedSolidPyramid {
    static void main() {
        int n = 4;
        for (int row = 1; row <= n; row++){
            for (int col = 1; col < row; col++){
                System.out.print("  ");
            }
            for (int col = 1; col <= n*2-row*2+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
