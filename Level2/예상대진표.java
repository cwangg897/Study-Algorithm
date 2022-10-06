그림으로 그려가면서 손으로 상황을 표현하는게 중요한 문제고 알고리즘 풀면서 중요한거같다.


class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while(true){
            a = (a/2 )+ (a%2);
            b = (b/2 )+ (b%2);
            answer+=1;
            if(a==b){
                break;
            }
        }
        
        return answer;
    }
}
