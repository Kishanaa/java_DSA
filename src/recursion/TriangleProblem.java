package recursion;

import java.util.ArrayList;
import java.util.List;

public class TriangleProblem {
    static int minimumTotal(List<List<Integer>> triangle, int sum, int r, int c) {

        if (r >= triangle.size()){
            return sum;
        }

        int ans = Integer.MAX_VALUE;
        int include1 = minimumTotal(triangle, sum + triangle.get(r).get(c), r+1, c);
        ans = Math.min(ans, include1);
        int include2 = minimumTotal(triangle, sum, r+1, c+1);
        ans = Math.min(ans, include2);


        return ans;

    }
    static void main() {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(2);
        triangle.add(row1);

        List<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(4);
        triangle.add(row2);

        List<Integer> row3 = new ArrayList<>();
        row3.add(6);
        row3.add(5);
        row3.add(7);
        triangle.add(row3);

        List<Integer> row4 = new ArrayList<>();
        row4.add(4);
        row4.add(1);
        row4.add(8);
        row4.add(3);
        triangle.add(row4);

        System.out.println(minimumTotal(triangle,0, 0,0));

    }
}
