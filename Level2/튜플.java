https://fbtmdwhd33.tistory.com/253
나는 뒤에것만 찾으면 되는줄알았지만 순서가 바뀌게 들어가는것이다

신박한 생각이 맨앞과 맨뒤를 제거하는거랑 },{ 로 나눈거고 
구현에 초점을 맞추면 맞출수있었다

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        List<String> list = new ArrayList<>();
        s = s.substring(2,s.length()-2);
        s = s.replace("},{", "-");
        String[] str = s.split("-");
        for(int i=0; i< str.length; i++){
            list.add(str[i]);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });


        for(int i=0; i<list.size(); i++){
            String s1 = list.get(i);
            String[] split = s1.split(",");
            for(int j=0; j< split.length; j++){
                String s2 = split[j];
                int a = Integer.parseInt(s2);
                if(!answer.contains(a)){
                    answer.add(a);
                }
            }
        }


        return answer;
    }
}
