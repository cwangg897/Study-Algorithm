경험으로 푼 문제였다 

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int[][] dp = new int[land.length][land[0].length];
        for(int i=0; i<4; i++){
            dp[0][i] = land[0][i];
        }
        
        for(int i=1 ;i< land.length; i++){
            for(int j=0; j<4; j++){
                if(j==0){
                    dp[i][0] = Math.max(dp[i][0], dp[i-1][1]+land[i][0]);
                    dp[i][0] = Math.max(dp[i][0], dp[i-1][2]+land[i][0]);
                    dp[i][0] = Math.max(dp[i][0], dp[i-1][3]+land[i][0]);
                } else if(j==1){
                    dp[i][1] = Math.max(dp[i][1], dp[i-1][0]+land[i][1]);
                    dp[i][1] = Math.max(dp[i][1], dp[i-1][2]+land[i][1]);
                    dp[i][1] = Math.max(dp[i][1], dp[i-1][3]+land[i][1]);
                } else if(j==2){
                    dp[i][2] = Math.max(dp[i][2], dp[i-1][0]+land[i][2]);
                    dp[i][2] = Math.max(dp[i][2], dp[i-1][1]+land[i][2]);
                    dp[i][2] = Math.max(dp[i][2], dp[i-1][3]+land[i][2]);
                } else if(j==3){
                    dp[i][3] = Math.max(dp[i][3], dp[i-1][0]+land[i][3]);
                    dp[i][3] = Math.max(dp[i][3], dp[i-1][1]+land[i][3]);
                    dp[i][3] = Math.max(dp[i][3], dp[i-1][2]+land[i][3]);
                }
            }
        }

        for(int i=0; i<4; i++){
            answer = Math.max(answer, dp[land.length-1][i]);
        }

        return answer;
    }
}
