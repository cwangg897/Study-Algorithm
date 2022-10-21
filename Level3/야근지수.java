dfs는 시간초과가났다 솔직히 아닌거같아서 생각해보니 
제곱수를 비교해보면 
2제곱 = 4
3제곱 = 9
4제곱 = 16
무조건 큰것을 줄이는게 답이다 따라서 매번정렬보다 우선순위큐를 활용했다

import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        if(Arrays.stream(works).sum() < n){
            return answer;
        }
        PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i< works.length; i++){
            pq.offer(works[i]);
        }

        while (n!=0){
            int poll = pq.poll();
            pq.offer(poll-1);
            n--;
        }
        while(!pq.isEmpty()){
            int poll = pq.poll();
            answer += poll*poll;
        }
        return answer;
    }
}
