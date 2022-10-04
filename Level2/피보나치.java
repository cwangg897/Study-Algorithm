재귀로안푸는게 답이다 재귀로 푼다면 2^n만큼 시간복잡도가걸린다. 이방법은 공부해야겠다
아직 재귀 함수의 시간복잡도는 구하는방법을 잘 모르겠다.
  

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] dp = new int[100001];
        dp[0] =0;
        dp[1] =1;
        for(int i=2; i<=n; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        answer = dp[n];
        return answer;
    }
}
