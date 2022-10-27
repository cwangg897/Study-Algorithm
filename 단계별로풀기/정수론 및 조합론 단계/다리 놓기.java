일단 팩토리얼 범위가 30! 이 long을 넘어가서 BigInteger이고 dp를 써야 빠를것같았다
이항계수 2랑 차이가먼지모르겠네

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger[] dp = new BigInteger[31];

        dp[0] = BigInteger.valueOf(1);
        dp[1] = BigInteger.valueOf(1);

        for(int i=2; i<=30; i++){
            dp[i] = dp[i-1].multiply(BigInteger.valueOf(i));
        }


        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            BigInteger num = dp[n].divide( (dp[n-k].multiply(dp[k])));

            System.out.println(num);
        }

    }
}
