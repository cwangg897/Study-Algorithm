import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        char before = words[0].charAt(words[0].length()-1);

        int count = 0;
        for(int i=1; i< words.length; i++){
            if(set.contains(words[i]) || words[i].charAt(0) != before){
                count = i+1;
                break;
            }
            before = words[i].charAt(words[i].length()-1);
            set.add(words[i]);
        }

        if(count ==0){
            return answer;
        }


        // 9니까
        if(count%n ==0 ){
            answer[0] = n;
            answer[1] = count/n;
            
        } else{
            answer[0] = count%n;
            answer[1] = (count/n) +1;
        }






        return answer;
    }
}
