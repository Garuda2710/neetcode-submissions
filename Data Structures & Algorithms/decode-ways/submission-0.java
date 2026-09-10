class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,s,dp);
    }
    int solve(int index,String s,int[]dp){
        int n=s.length();
        if(index==n){return 1;}
        if(s.charAt(index)=='0'){return 0;}
        if(dp[index]!=-1){return dp[index];}
        int ways=solve(index+1,s,dp);
        //two digits
        if(index+1<n){
            int number=(s.charAt(index)-'0')*10+(s.charAt(index+1)-'0');
            if(number>=10 && number<=26){
                ways+=solve(index+2,s,dp);
            }
        }
        dp[index]=ways;
        return dp[index];
    }
}
