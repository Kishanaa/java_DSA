package recursion;

import java.util.ArrayList;
import java.util.List;

public class TriangleProblem {
    static int minimumTotal(List<List<Integer>> triangle, int sum, int i) {

        if (i >= triangle.size()){
            return sum;
        }

        int include1 = minimumTotal(triangle, sum + triangle.get())

        return 0;

    }
    static void main() {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(2);
        triangle.add(row1);

        List<Integer> row2 = new ArrayList<>();
        row1.add(3);
        row1.add(4);
        triangle.add(row2);

        List<Integer> row3 = new ArrayList<>();
        row1.add(6);
        row1.add(5);
        row1.add(7);
        triangle.add(row3);

        List<Integer> row4 = new ArrayList<>();
        row1.add(4);
        row1.add(1);
        row1.add(8);
        row1.add(3);
        triangle.add(row4);

        minimumTotal(triangle,0, 0);

    }
}
