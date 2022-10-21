처음에 나는 dfs로 다 확인했는데 생각해보면 곱이 최대될려면 중간값들이다.
 따라서 중간값을 구하고 나머지만큼 +1 씩해주면된다. 오름차순이니 뒤에서부터 진행했다.
  실패조건도 확인하는게 중요하다
  
  
  class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        if(n>s){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } else{
            int num = s/n;
            int mod = s%n;
            answer = new int[n];
            // 나눠지는 경우
            if(s%n == 0){
                for(int i=0; i<n; i++){
                    answer[i] = num;
                }
                // 나눠지지 않는경우
            } else{
                for(int i=0; i<n; i++){
                    answer[i] = num;
                }
                for(int i= answer.length-1; i>=answer.length-mod; i--){
                    answer[i] ++;
                }
            }
            
        }


        return answer;
    }
}
