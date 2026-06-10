package searching;

public class PainterPartition {
    static int partition(int[] boards, int painters){
        int ans = 0;
        int minBoards = 0;
        int maxBoards = 0;

        for(int board : boards){
            maxBoards += board;
            minBoards = Math.max(minBoards, board);
        }

        while (minBoards<=maxBoards){
            int midBoards = minBoards + (maxBoards - minBoards)/2;
            if (partitionCondition(boards, painters, midBoards)){
                ans = midBoards;
                maxBoards = midBoards - 1;
            }else{
                minBoards = midBoards + 1;
            }
        }


        return ans;
    }

    private static boolean partitionCondition(int[] boards, int painters, int midBoards) {
        int n = boards.length - 1;
        boolean condition = true;
        int sum = 0;

        for (int i = 0; i <= n; i++){
            if ((sum + boards[i]) <= midBoards){
                sum += boards[i];
            }else{
                painters--;
                if (painters == 0){
                    condition = false;
                }
                sum = 0;
                sum += boards[i];
            }
        }

        return condition;
    }

    static void main() {
        int[] boards = {100, 200, 300, 400};
        int painters = 1;


        System.out.println(partition(boards, painters));
    }
}
