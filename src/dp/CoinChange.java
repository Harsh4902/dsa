package dp;

public class CoinChange {

    public static void main(String[] args) {

    }

    public int solveUsingTopDownApproach(int[] dp,int[] coins, int amount){
        if(amount == 0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=-1){
            return dp[amount];
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans = solveUsingTopDownApproach(dp,coins,amount-coins[i]);
            if(ans != Integer.MAX_VALUE){
                min = Math.min(min,ans+1);
            }
        }
        dp[amount] = min;
        return dp[amount];
    }

}
