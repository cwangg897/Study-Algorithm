런타임 에러가 났는데 주의할점은
keySet을 사용하는데 key를 지우면 동시성이슈로인해 발생합니다
https://velog.io/@sheltonwon/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A3%BC%EC%B0%A8-%EC%9A%94%EA%B8%88-%EA%B3%84%EC%82%B0-JAVA

import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        // 기본시간, 기본요금, 단위시간, 단위요금
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();

        for(int i=0; i< records.length; i++){
            String[] s = records[i].split(" ");
            // 시간 번호 상태
            if(s[2].equals("IN")){
                map.put(s[1], s[0]);
            }

            if(s[2].equals("OUT")){
                String[] s1 = map.get(s[1]).split(":"); // IN
                String[] s2 = s[0].split(":"); // OUT
                int minute = ((Integer.parseInt(s2[0]) * 60) +  Integer.parseInt(s2[1]) )- ((Integer.parseInt(s1[0]) * 60) +  Integer.parseInt(s1[1]));
                map.remove(s[1]);
                if(result.containsKey(s[1])){
                    result.put(s[1], result.get(s[1])+minute);
                } else{
                    result.put(s[1], minute);
                }
            }
        }

        // 남아있는 차 확인
        for(String key : map.keySet()){
            String s = map.get(key);
            String time = "23:59";
            String[] s1 = s.split(":");
            String[] s2 =  time.split(":");
            int minute = ((Integer.parseInt(s2[0]) * 60) +  Integer.parseInt(s2[1]) )- ((Integer.parseInt(s1[0]) * 60) +  Integer.parseInt(s1[1]));
            if(result.containsKey(key)){
                result.put(key, result.get(key)+minute);
            } else{
                result.put(key, minute);
            }
        }

        List<Car> list = new ArrayList<>();

        // 기본시간, 기본요금, 단위시간, 단위요금
        for(String key : result.keySet()){
            int value = result.get(key);
            value = value - fees[0];
            int sum = 0;
            if(value<=0){
                sum = fees[1];
            } else{
                if(value%fees[2] == 0){
                    sum = fees[1] + ((value/fees[2]) * fees[3]);
                } else{
                    sum = fees[1] + (((value/fees[2]) +1) * fees[3]);
                }
            }
            list.add(new Car(key, sum));
        }

        answer = new int[list.size()];
        Collections.sort(list);
        for(int i=0; i< list.size(); i++){
            answer[i] = list.get(i).fee;
        }
        return answer;
    }

    static class Car implements Comparable<Car>{
        String carNum;
        int fee;

        public Car(String carNum, int fee){
            this.carNum = carNum;
            this.fee = fee;
        }

        @Override
        public int compareTo(Car o) {
            return this.carNum.compareTo(o.carNum);
        }
    }
}
