package dp;

public class LIS {

    public static void main(String[] args) {

    }

    public int usingTopDownApproach(int[] nums,int curr,int prev,int[][] dp){
        if(curr>=nums.length){
            return 0;
        }

        if(dp[curr][prev+1]!=-1){
            return dp[curr][prev+1];

        }

        int include = 0;
        if(prev == -1 ||  nums[curr]>nums[prev]){
            include = 1 + usingTopDownApproach(nums,curr+1,curr,dp);
        }

        int exclude = 0 + usingTopDownApproach(nums,curr+1,prev,dp);

        dp[curr][prev+1] = Math.max(include,exclude);
        return dp[curr][prev+1];
    }

}
