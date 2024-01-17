package dp;

public class LCS {

    public static void main(String[] args) {

    }

    public int usingTopDownApproach(String s1,String s2,int i, int j,int[][] dp){
        if(i==s1.length()){
            return 0;
        }
        if(j==s2.length()){
                return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = 0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans = 1 + usingTopDownApproach(s1,s2,i+1,j+1,dp);
        }
        else {
            ans = 0 + Math.max(usingTopDownApproach(s1, s2, i + 1, j, dp), usingTopDownApproach(s1, s2, i, j + 1, dp));
        }

        dp[i][j] = ans;
        return dp[i][j];
    }

}
