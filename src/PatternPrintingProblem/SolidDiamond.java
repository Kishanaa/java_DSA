package PatternPrintingProblem;

// Difficulty level - Medium
public class SolidDiamond {
    static void main() {
        int n = 4;

//        Pyramid
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n-row; col++){
                System.out.print("  ");
            }
            for (int col = 1; col <= row*2-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

//        Inverted Pyramid
        for (int row = 1; row <= n; row++){
            if (row==1){
                continue;
            }
            for (int col = 1; col <= n*2-row; col++){
                if (col<=row-1){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
