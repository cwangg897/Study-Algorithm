방심하면 틀린다


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n + 1][n + 1];
        long[][] dp = new long[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        dp[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int num = map[i][j];

                if(i == n && j==n){
                    continue;
                }
                // 오른쪽
                if (j + num <= n) {
                    dp[i][j + num] += dp[i][j];
                }
                // 아래쪽으로
                if (i + num <= n) {
                    dp[i + num][j] += dp[i][j];
                }
            }
        }
        System.out.println(dp[n][n]);


    }
}
