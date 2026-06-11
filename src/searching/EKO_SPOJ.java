package searching;

public class EKO_SPOJ {
    static boolean cutCondition(int[] trees, int m, int midCut){
        boolean ans = true;
        int sum = 0;
        int n = trees.length - 1;

        for (int i = 0; i <= n; i++){
            if (midCut<trees[i]){
                int leftPart = trees[i] - midCut;
                sum+=leftPart;
            }
        }
        if (sum<m){
            ans = false;
        }



        return ans;
    }
    static int eko(int[] trees, int m){
        int ans = 0;
        int minCut = 0;
        int maxCut = trees[trees.length-1];

        while (minCut<=maxCut){
            int midCut = minCut + (maxCut - minCut) / 2;

            if (cutCondition(trees,m,midCut)){
                ans = midCut;
                minCut = midCut + 1;
            }else {
                maxCut = midCut - 1;
            }
        }


        return ans;
    }

    static void sort(int[] trees){  // It is unnecessary here, I just want to practice sorting
        int n = trees.length - 1;
        int smallest , smallestIndex ;

        for (int i = 0; i <= n; i++){
            smallest = trees[i];
            smallestIndex = i;
            for (int j = i; j <= n; j++){
                if (trees[j] < smallest){
                    smallest = trees[j];
                    smallestIndex = j;
                }
            }
            trees[smallestIndex] = trees[i];
            trees[i] = smallest;

        }
    }
    static void main() {
        int[] trees = {20,15,10,17}; // tree heights
        int m = 7;  // required amount of wood you need to collect

        sort(trees);
        System.out.println(eko(trees,m));

    }
}
