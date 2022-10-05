그리디 조건을 찾는것이다
뚱보랑 마른사람이랑 타는게 가장 최적이다
그래서 큰사람이랑 작은사람이랑 더해가면 진행한다
만약맞으면 작은사람위치가 다음위치로 가고 큰사람만타면 보트개수만 증가시키고 i를 -1을 해서 진행한다
이게 좋은코드인게 마지막에 한사람이 남아도 멀해도 answer+=1이 된다는점이다

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int idx = 0;

        for(int i=people.length-1; i>=idx; i--){
            if(people[i] + people[idx] <= limit){
                idx +=1;
                answer+=1;
            } else{
                answer+=1;
            }
        }
        return answer;
    }
}
