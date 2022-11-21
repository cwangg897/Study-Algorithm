import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for(int i=0; i<survey.length; i++){
            // 4보다 적어나
            if(choices[i] == 1) map.put(survey[i].charAt(0),map.get(survey[i].charAt(0)) + 3 );
            if(choices[i] == 2) map.put(survey[i].charAt(0),map.get(survey[i].charAt(0)) + 2 );
            if(choices[i] == 3) map.put(survey[i].charAt(0),map.get(survey[i].charAt(0)) + 1 );
            if(choices[i] == 5) map.put(survey[i].charAt(1),map.get(survey[i].charAt(1)) + 1 );
            if(choices[i] == 6) map.put(survey[i].charAt(1),map.get(survey[i].charAt(1)) + 2 );
            if(choices[i] == 7) map.put(survey[i].charAt(1),map.get(survey[i].charAt(1)) + 3 );
        }
        StringBuilder sb = new StringBuilder();
        if(map.get('R') < map.get('T')){
            sb.append('T');
        } else {
            sb.append('R');
        }

        if(map.get('C') < map.get('F')){
            sb.append('F');
        } else{
            sb.append('C');
        }

        if(map.get('J') < map.get('M')){
            sb.append('M');
        } else{
            sb.append('J');
        }

        if(map.get('A') < map.get('N')){
            sb.append('N');
        } else{
            sb.append('A');
        }

        answer = sb.toString();
        return answer;
    }
}
