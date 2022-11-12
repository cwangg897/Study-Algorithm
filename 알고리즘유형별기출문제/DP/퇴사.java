뒤에서부터 생각하면 편하다 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] day = new int[n+1];
        int[] money = new int[n+1];
        int[] dp = new int[n+2]; // N+1일까지

        for(int i=1; i<=n; i++){
            day[i] = sc.nextInt();
            money[i] = sc.nextInt();
        }

        for(int i = n; i>=1; i--){
            if(i+day[i] <= n+1){
                dp[i] = Math.max(dp[i+1], money[i]+dp[i+day[i]]);
            } else{
                dp[i] = dp[i+1];
            }
        }
        System.out.println(dp[1]);



    }
}
