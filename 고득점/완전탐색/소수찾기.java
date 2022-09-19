import java.util.*;


class Solution {
    private Set<Integer> set = new HashSet<>();
    private String[] sArr;
    private boolean[] visited;
    public int solution(String numbers) {
        int answer = 0;
        sArr = numbers.split("");
        visited = new boolean[sArr.length];
        dfs(0, "");
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int next = iterator.next();
            if(check(next)){
                answer +=1;
            }
        }


        return answer;
    }



    public void dfs(int count, String s){
        if(sArr.length == count ){
            if(!s.equals("")){
                set.add(Integer.parseInt(s));
            }
            return;
        }

        for(int i=0; i< sArr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(count+1, s+sArr[i]);
                visited[i] = false;
            } else{
                dfs(count+1, s);
            }
        }

    }

    public boolean check(int num){
        if(num == 1|| num == 0){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
