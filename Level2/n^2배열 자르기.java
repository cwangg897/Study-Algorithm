진짜 이상한 문제다
앞으로는 메모리 초과가 난다면 배열로 푸는게 아니라 규칙을 찾는것이다. 매우중요하다 
// 정답
import java.util.*;

class Solution {
    public ArrayList<Long> solution(int n, long left, long right) {
        ArrayList<Long> answer =  new ArrayList<>();
        for(long i = left ; i<=right; i++){
            answer.add(Math.max(i/n, i%n)+1);
        }



        return answer;
    }
}


import java.util.*;
// 첫풀이
class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer =  new int[(int)(right -left+1)];
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            int idx = 1;
            for(int j=0; j<n; j++){
                if(j<=i){
                    arr[i][j] = i+1;
                } else{
                    arr[i][j] = i+1+idx;
                    idx+=1;
                }
            }
        }

        int idx = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(count >= left && count <=right){
                    answer[idx] = arr[i][j];
                    idx+=1;
                }
                count+=1;
            }
        }





        return answer;
    }
}

