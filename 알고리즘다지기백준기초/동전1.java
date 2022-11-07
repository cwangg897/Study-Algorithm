만약 순서만 다르고 조합이 같은 경우를 중복시키지 않으려면 어떻게 해야할까?
1개쓰는거 2개쓰는거 dp에 합을해주면 2중 for문이 매우중요하다


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[k+1];
        int[] arr=  new int[n];

        dp[0] = 1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=1; j<=k; j++){ // 가격까지 일단 진행하면
                if(j >= arr[i]){
                    dp[j] += dp[j-arr[i]];
                }
            }
        }
        System.out.println(dp[k]);

    }
}
