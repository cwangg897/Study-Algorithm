쉬운 dp문제였다


class Solution {
    public int solution(int[][] triangle) {
        int answer = Integer.MIN_VALUE;
        
        int[][] dp = new int[triangle.length][triangle[triangle.length-1].length];
        dp[0][0] = triangle[0][0];
        for(int i=1; i< triangle.length; i++){
            dp[i][0] = dp[i-1][0] + triangle[i][0];
        }

        for(int i=1; i< triangle.length; i++){
            for(int j=1; j< triangle[i].length; j++){
                if(i==j){
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                } else{
                    int max = Math.max(dp[i-1][j-1] , dp[i-1][j]);
                    dp[i][j] = max + triangle[i][j];
                }
            }
        }

//        for(int i=0; i< triangle.length; i++){
//            for(int j=0; j< triangle[i].length; j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        int last = triangle[triangle.length-1].length;
        for(int i=0; i< triangle[triangle.length-1].length; i++){
            answer = Math.max(answer, dp[last-1][i]);
        }
        

        return answer;
    }
}
