나는 생각하지못했는데 데이터 개수를 보니 BF인거같았다.
  

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=i; j<=n; j++){
                sum +=j;
                if(sum == n){
                    answer+=1;
                    break;
                }

                if(sum > n){
                    break;
                }
            }
        }
        return answer;
    }
}
