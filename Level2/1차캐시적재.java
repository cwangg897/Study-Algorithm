처음에 7번과 17번 틀려서 90점이었다.
원인은  cacheSize가 0인경우는 더 빨리 답을 구하는 경우가있기때문이다. 그래서 변수의 범위를 잘 살피자


import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int cache = 0;
        Queue<String> queue = new LinkedList<>();
        
        if(cacheSize == 0){
            answer = cities.length * 5;
            return answer;
        }

        for(int i=0; i< cities.length; i++){
            String s = cities[i].toUpperCase();
            if(queue.contains(s)){
                cache+=1;
                queue.remove(s);
                queue.offer(s);
            } else {
                cache+=5;
                if(queue.size()>=cacheSize){
                    queue.poll();
                }
                queue.offer(s);
            }
        }
        answer =cache;

        return answer;
    }
}
