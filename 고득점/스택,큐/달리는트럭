import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for(int i=0; i< truck_weights.length; i++){
            int w = truck_weights[i];

            while(true){
                if(bridge.isEmpty()){
                    bridge.offer(w);
                    sum += w;
                    time+=1;
                    break;
                } else if(bridge.size() == bridge_length){
                    sum -= bridge.poll();
                } else{
                    if(sum + w <= weight){
                        bridge.offer(w);
                        sum += w;
                        time +=1;
                        break;
                    } else{
                        bridge.offer(0);
                        time +=1;
                    }
                }
            }
        }

                
        return time + bridge_length;
    }
}
