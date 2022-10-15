띄어쓰기를 고민했는데 Enter를 나중에 바꿔주면 되기때문에 간단한 문제였다

import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        // 아이디, 닉네임
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put("Enter", "님이 들어왔습니다.");
        map.put("Leave", "님이 나갔습니다.");

        for(int i=0; i< record.length; i++){
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter")){
                map.put(str[1], str[2]);
                list.add(str[1]+" "+str[0]);
            }

            if(str[0].equals("Leave")){
                list.add(str[1]+" "+str[0]);
            }

            if(str[0].equals("Change")){
                map.put(str[1], str[2]);
            }
        }
        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            String[] split = list.get(i).split(" ");
            String str = "";
            str += map.get(split[0]);
            str += map.get(split[1]);
            answer[i] = str;
        }
        

        return answer;
    }
}
