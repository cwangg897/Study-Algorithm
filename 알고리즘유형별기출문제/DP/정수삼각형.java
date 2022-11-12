import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j==1){
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                } else if(i==j){
                    dp[i][j] = dp[i-1][j-1] + arr[i][j];
                } else{
                    dp[i][j] = Math.max(dp[i-1][j]+arr[i][j], dp[i-1][j-1]+arr[i][j]);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            max = Math.max(max, dp[n][i]);
        }
        System.out.println(max);



    }
}
