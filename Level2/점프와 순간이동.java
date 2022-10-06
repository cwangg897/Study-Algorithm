dp치고는 10억이라고해서 메모리가 모자르다고생각했다.
그래서 규칙을 찾았다 홀수일때 증가된다는것을 

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n!=0){
            if(n%2==1){
                ans +=1;
            }
            n = n/2;
        }

        return ans;
    }
}
