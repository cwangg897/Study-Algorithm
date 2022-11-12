import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1; i<=N+1; i++){
            map.put(i, 0);
        }

        for(int i=0; i< stages.length; i++){
            map.put(stages[i], map.get(stages[i])+1);
        }

        int len = stages.length;
        List<Stage > list = new ArrayList<>();
        for(int i=1; i<=N; i++){
            // 0나누기는안됨
            if(map.get(i) == 0 || len == 0){
                list.add(new Stage(i, 0));
            } else{
                list.add(new Stage(i, (double)map.get(i)/len));
            }
            
            len -= map.get(i);
        }
        Collections.sort(list);
        for(int i=0; i< list.size(); i++){
            answer[i] = list.get(i).stage;
        }

        return answer;
    }

    static class Stage implements Comparable<Stage>{
        int stage;
        double fail;

        public Stage(int stage, double fail){
            this.stage = stage;
            this.fail = fail;
        }

        @Override
        public int compareTo(Stage o) {
            if(this.fail == o.fail){
                return this.stage - o.stage;
            }
            return Double.compare(o.fail, this.fail);
        }
    }
}

-----------------------------------
  
import java.util.* ;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageNum = new int[N+2]; // N+1까지있다고하니까
        List<Game> list = new ArrayList<>();
        for(int stage : stages){
            stageNum[stage] +=1;
        }

        int remainNum = stages.length;
        for(int i=1; i<= N; i++){
            double failure = 0;
            if(stageNum[i] == 0){
                failure = 0;
            } else{
                failure = (double) stageNum[i] / remainNum;
            }
            remainNum -= stageNum[i];
            list.add(new Game(i,failure));
        }

        Collections.sort(list);
        for(int i=0; i<N ;i++){
            answer[i] = list.get(i).stage;
        }

        for(int i=0; i<N ;i++){
            System.out.println("stage ; "+list.get(i).stage + " fail : "+list.get(i).fail);
        }

        return answer;
    }
    
    static class Game implements Comparable<Game>{
        int stage;
        double fail;

        public Game(int stage, double fail){
            this.stage = stage;
            this.fail = fail;
        }

        @Override
        public int compareTo(Game o) {
            if(this.fail == o.fail){
                return this.stage - o.stage;    
            } 
            return Double.compare(o.fail, this.fail);
        }
    }
}
  
