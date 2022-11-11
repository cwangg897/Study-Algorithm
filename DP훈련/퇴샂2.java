뒤에서부터 생각하면 쉽다

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n+1];
        int[] money = new int[n+1];

        int[] dp = new int[n+2];
        for(int i=1; i<=n; i++){
            t[i] = sc.nextInt();
            money[i] = sc.nextInt();
        }

        for(int i=n; i>=1; i--){
            // 작으면 진행
            if(i+t[i] <= n+1){
                dp[i] = Math.max(money[i]+dp[i+t[i]], dp[i+1]);
            } else{
                dp[i] = dp[i+1];
            }
        }
        System.out.println(dp[1]);


    }
}
