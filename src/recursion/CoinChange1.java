package recursion;

public class CoinChange1 {
    static int change(int amount, int[] coins) {
        if (amount == 0){
            return 0;
        }
        if (amount < 0){
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;
        for (int coin : coins){
            int ans = change(amount-coin,coins);
            if (ans != Integer.MAX_VALUE){
                int totalCoinsUsed = ans+1;
                min = Math.min(totalCoinsUsed,min);
            }
        }
        return min;
    }

    static void main() {
        int[] arr = {1,2,5};
        int target = 11;
        System.out.println(change(target, arr));
    }
}
