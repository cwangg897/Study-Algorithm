구현이라고 생각했다. 스킬트리가 지켜지는지 확인하는 검증이 필요해서 
list를 사용했다

import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        List<Character> list = new ArrayList<>();
        for(int i=0; i<skill.length(); i++){
            list.add(skill.charAt(i));
        }

        for(int i=0; i< skill_trees.length; i++){
            String s = "";
            for(int j=0; j<skill_trees[i].length(); j++){
                if(list.contains(skill_trees[i].charAt(j))){
                    s += skill_trees[i].charAt(j);
                }
            }
            boolean check = true;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) != skill.charAt(j)){
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
