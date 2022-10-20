WX, XW는 같기때문에 dfs에서 정렬을 하고 추가해줘야한다.
  
import java.util.*;

class Solution {
    static Map<String, Integer> map = new HashMap<>();
    static List<String> result = new ArrayList<>();

    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};

        // map에 개수를 담음
        for(int i=0; i<orders.length; i++){
            dfs("", orders[i], 0);
        }

        // 길이랑 최소 2개 이상인것을 리스트에 담는다
        for(int i=0; i<course.length; i++){
            List<Course> list = new ArrayList<>();
            int num = course[i];
            for(String str : map.keySet()){
                if(str.length() == num && map.get(str) >=2){
                    list.add(new Course(str, map.get(str)));
                }
            }
            Collections.sort(list);
            // 담은곳에서 최고를 뽑는데 만약 제일 큰거보다 같은게 있으면 넣는다
//            for(int j=0; j<list.size(); j++){
//                System.out.println("str : "+list.get(j).str+ " num : "+list.get(j).num);
//            }

            if(list.size() >= 1){
                for(int j=0; j<list.size(); j++){
                    int max = list.get(0).num;
                    if(max == list.get(j).num){
                        result.add(list.get(j).str);
                    }
                }
            }
        }

        answer = new String[result.size()];
        Collections.sort(result);

        for(int i=0; i< result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }


    public static void dfs(String str, String ori, int count){
        if(count == ori.length()){
            if(!str.isEmpty()){
                List<Character> list = new ArrayList<>();
                for(int i=0; i<str.length(); i++){
                    list.add(str.charAt(i));
                }
                Collections.sort(list);
                String newStr = "";
                for(int i=0; i<list.size(); i++){
                    newStr += list.get(i);
                }
                
                if(map.containsKey(newStr)){
                    map.put(newStr, map.get(newStr)+1);
                } else{
                    map.put(newStr, 1);
                }
            }

            return;
        }

        dfs(str+ori.charAt(count),ori, count+1);
        dfs(str, ori, count+1);
    }

    static class Course implements Comparable<Course>{
        String str;
        int num;
        public Course(String str, int num){
            this.str = str;
            this.num = num;
        }

        @Override
        public int compareTo(Course o) {
            return o.num - this.num;
        }
    }

}
