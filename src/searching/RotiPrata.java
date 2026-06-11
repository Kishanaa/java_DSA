package searching;

public class RotiPrata {
    static boolean prataCondition(int[] cooksRanks, int cooks, int prataRequired, int midMinute){
        boolean move = true;
        int totalPrata = 0;


        for (int c = 0; c < cooks; c++){
            int exitCondition = 0;
            for (int p = 1; p <= midMinute; p++){
                if (p%cooksRanks[c]==0){
                    exitCondition+=p;
                    if (exitCondition>midMinute){
                        break;
                    }
                    totalPrata++;
                }
            }
        }

        if (totalPrata<prataRequired){
            move = false;
        }

        return move;
    }
    static int minReq(int[] cooksRanks, int cooks, int prataRequired){
        int ans = 0;
        int minMinute = 0;
        int maxMinute = 0;
        for(int i = 0; i <= prataRequired; i++){
            maxMinute += cooksRanks[0] * i;
        }

        while (minMinute<=maxMinute){
            int midMinute = minMinute + (maxMinute - minMinute)/2;
            if (prataCondition(cooksRanks, cooks, prataRequired,midMinute)){
                ans = midMinute;
                maxMinute = midMinute - 1;
            }else{
                minMinute = midMinute + 1;
            }
        }

        return ans;
    }
    static void main() {
        int[] cooksRanks = {1,2,3,4};
        int cooks = 4;
        int prataRequired = 10;

        System.out.println(minReq(cooksRanks,cooks,prataRequired));
    }
}
