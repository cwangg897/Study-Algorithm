처음에는 Deque를 사용할려고했지만 매번 String이 필요하고 변환과정이 이루어지지않기때문에 
subString을 사용했다.
  
import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) { // 회전시키기
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for(int j=0; j<s.length(); j++){ // 스택으로 확인
                if(stack.isEmpty()){
                    if(s.charAt(j) == ')' || s.charAt(j) == ']' || s.charAt(j) == '}'){
                        check = false;
                        break;
                    }
                    stack.add(s.charAt(j));
                } else{
                    char ch = stack.peek();
                    if(ch == '(' && s.charAt(j) == ')'){
                        stack.pop();
                    } else if(ch == '[' && s.charAt(j) == ']'){
                        stack.pop();
                    } else if(ch == '{' && s.charAt(j) == '}'){
                        stack.pop();
                    } else{
                        stack.add(s.charAt(j));
                    }
                }
            }
            if(!stack.isEmpty()){
                check = false;
            }
            if(check){
                answer+=1;
            }

            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }


}
