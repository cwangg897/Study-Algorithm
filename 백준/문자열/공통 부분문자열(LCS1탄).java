import java.util.*;

공통연속 문자열임 공통이라서 연속된부분이 꼭 마지막일경우가아님
dp로 봤을때 부분수열은 부분수열의 최대일경우를계산하는것인데
공통부분은 dp가 연속값을가지기때문이다.
그리고 길이라는 표현이어서 Integer.MINVALUE로 하지못한다


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        int max = 0;
        for(int i=1; i<=s1.length(); i++){
            for(int j=1; j<=s2.length(); j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] +1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        System.out.println(max);

    }
}
