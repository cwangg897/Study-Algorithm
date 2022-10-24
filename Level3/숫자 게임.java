처음 2중 for문 안돼서 
이분탐색 생각했는데 큰부분이 중간이라 적합한걸 찾을수없었다
그래서 2중 for문을 줄이는것인데
어차피 순서가 정해져있으면 알아서 낼수있다는것이고 그래서 적합한걸 내기만해서 점수만찾으면되는거라서
A도 정렬을하는것이다



import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = -1;

        Arrays.sort(A);
        Arrays.sort(B);
        int b_idx = B.length-1;

        int count = 0;
        for(int i= A.length-1; i>=0; i--){
            int a = A[i];
            int b = B[b_idx];
            if(a < b){
                count+=1;
                b_idx -=1;
            }
        }
        
        answer = count;
        return answer;
    }
}
