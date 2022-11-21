class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int zeroCount = 0;
        for(int i=0; i< lottos.length; i++){
            if(lottos[i] == 0){
                zeroCount+=1;
            }
        }
        boolean[] check = new boolean[46];
        for(int i=0; i< win_nums.length; i++){
            int num = win_nums[i];
            check[num] = true;
        }
        int count = 0;
        for(int i=0; i< lottos.length; i++){
            if(check[lottos[i]]){
                count +=1;
            }
        }
        // 최고와
        // 최저
        answer = new int[2];
        answer[0] = rank(count+zeroCount);
        answer[1] = rank(count);
        return answer;
    }
    
    public static int rank(int count){
        if(count == 6) return 1;
        if(count == 5) return 2;
        if(count == 4) return 3;
        if(count == 3) return 4;
        if(count == 2) return 5;
        return 6;
    }
}
