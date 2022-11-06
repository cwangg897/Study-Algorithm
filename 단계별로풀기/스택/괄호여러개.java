import java.util.*;

//  ‘[‘, ‘{‘, ‘(‘, ‘)’, ‘}’, ‘]’ 괄호의 종류
// (){()}[]
class Solution {
    public String solution(String S) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        boolean check = true;
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            if(stack.isEmpty()){
                if(c==')' || c==']' || c=='}'){
                    check = false;
                    break;
                } else{
                    stack.add(c);
                }
            } else{
                // 비어있지 않는 경우
                Character peek = stack.peek();
                if(peek == '(' && c==')'){
                    stack.pop();
                } else if(peek == '[' && c==']'){
                    stack.pop();
                } else if(peek == '{' && c=='}'){
                    stack.pop();
                } else{
                    stack.add(c);
                }
            }
        }
        if(stack.isEmpty() && check){
            answer = "TRUE";
        } else{
            answer = "FALSE";
        }


        return answer;
    }
}
