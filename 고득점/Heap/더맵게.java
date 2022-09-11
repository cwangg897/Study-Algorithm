import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            priorityQueue.offer(scoville[i]);
        }
        
        while(priorityQueue.peek() < K && priorityQueue.size() >=2){
            int first = priorityQueue.poll();
            int second = priorityQueue.poll();
            int newScovil = first + (second*2);
            priorityQueue.offer(newScovil);
            answer +=1;
        }
        if(priorityQueue.peek() < K){
            answer = -1;
        }
        return answer;
    }
}
