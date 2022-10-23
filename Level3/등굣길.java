경우의 수였다 그래서 puddle관건인데 -1로 하고 0으로 바꾸면 나중에 카운트할때 세지지않는것이다

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        int[][] dp = new int[n + 1][m + 1];

        for(int i=0; i< puddles.length; i++){
            int[] puddle = puddles[i];
            dp[puddle[1]][puddle[0]] = -1;
        }

        dp[1][1] = 1;
        int num = 1;
        for(int i=2; i<=n; i++){
            if(dp[i][1] == -1){
                num = 0;
            }
            dp[i][1] = num;
        }
        num = 1;
        for(int i=2; i<=m; i++){
            if(dp[1][i] == -1){
                num = 0;
            }
            dp[1][i] = num;
        }
        
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                if(dp[i][j] == -1){
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) %1000000007;
            }
        }
        

        answer = dp[n][m];
        return answer;
    }
}
