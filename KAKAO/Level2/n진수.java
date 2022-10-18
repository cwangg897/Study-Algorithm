Integer에서 숫자를 n진수로 변환하는 메서드가있는지 몰라서 어려웠다.
그러나 찾으니 쉽게 해결했다

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String s = "";
        int num = 0;
        while(s.length() < m*t){
            s += Integer.toString(num, n);
            num +=1;
        }
        
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if((i%m) == p-1){
                if(count != t){
                    answer += s.charAt(i);
                    count +=1;
                }
            }
        }
        answer = answer.toUpperCase();
        return answer;
    }
}
