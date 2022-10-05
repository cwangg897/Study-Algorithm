문제에서 짝 이라는 단어는 stack을 의미하는 경우가 많은 것 같습니다.
대표적으로 괄호 짝에 대한 문제가 있져.
  
  
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stack.isEmpty()){
                char peek = stack.peek();
                if(peek == s.charAt(i)){
                    stack.pop();
                } else{
                    stack.add(s.charAt(i));
                }
            } else{
                stack.add(s.charAt(i));
            }
        }
        if(stack.isEmpty()){
            answer = 1;
        }
        return answer;
    }
}
