맵으로 푸는거 바로 생각나는거보면은 주특기인것같다

import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i< want.length; i++){
            map.put(want[i], number[i]);
        }

        for(int i =0 ;i< discount.length; i++){
            Map<String, Integer> copyMap = new HashMap<>(map);
            int day = 0;
            for(int j=i; j< discount.length; j++){
                if(day == 10){
                    break;
                }
                if(copyMap.containsKey(discount[j])){
                    copyMap.put(discount[j], copyMap.get(discount[j])-1);
                }
                day +=1;
            }
//            for (String s : copyMap.keySet()) {
//                System.out.println("key = "+s +" num = "+copyMap.get(s));
//            }
//            System.out.println("----------------------");

            boolean check = true;
            for(String s : copyMap.keySet()){
                if(copyMap.get(s) >0){
                    check = false;
                    break;
                }
            }

            if(check){
                answer+=1;
            }
        }


        return answer;
    }
}
