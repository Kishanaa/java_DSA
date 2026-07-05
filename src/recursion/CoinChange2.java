package recursion;

public class CoinChange2 {
    static int change(int amount, int[] coins, int index) {
        if (index >= coins.length){
            return 0;
        }
        if (amount<0){
            return 0;
        }
        if (amount==0){
            return 1;
        }

        int includeAns = change(amount-coins[index], coins, index);
        int excludeAns =  change(amount,coins,index+1);
        return includeAns + excludeAns;
    }
    static void main() {
        int[] arr = {1,2,5};
        int target = 5;
        System.out.println(change(target, arr, 0));

    }
}
