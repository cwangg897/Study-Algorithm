if(str.charAt(i-1) =='('){
 answer += cnt;
}
이코드가 핵심이다 이미 (()) 을 보면 (()일때 4를하고 )일때 만약 stack.peek()이면은 4+2 라서 값이 잘못된다 그래서 )이고 (이면 더해주고 그렇지않으면
끝난거라서 /=2 랑 pop을해주는것이다 


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        int cnt = 1;
        int answer = 0;

        boolean check = true;
        for(int i=0; i<str.length(); i++){
            char cur = str.charAt(i);
            if(cur == '('){
                stack.add(cur);
                cnt *=2;
            } else if(cur == '['){
                stack.add(cur);
                cnt *=3;
            } else{
                if(cur == ']'){
                    if(stack.isEmpty() || stack.peek() != '['){
                        check = false;
                        break;
                    }
                    if(str.charAt(i-1) =='['){
                        answer += cnt;
                    }
                    stack.pop();
                    cnt /=3;

                } else if(cur == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        check = false;
                        break;
                    }
                    if(str.charAt(i-1) =='('){
                        answer += cnt;
                    }
                    stack.pop();
                    cnt /=2;
                } else{
                    check = false;
                    break;
                }
            }
        }

        if(!stack.isEmpty() || !check){
            System.out.println(0);
        } else{
            System.out.println(answer);
        }


    }
}
