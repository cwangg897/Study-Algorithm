런타임나서 알아보면
대부분 사람들은 Deque을 사안해서이고 StringBuilder를 통하지않아서 그렇다 그리고 n=0이 경우를 처리해줘야한다
노입력이면 0 그리고 출력시 먼저 추가하는것도 이런방법

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<t; i++) {
            String str = sc.next(); // RDD
            int n = sc.nextInt();
            String s = sc.next();
            s = s.substring(1, s.length() - 1);
            String[] sArr = s.split(",");
            // 입력했음
            Deque<String> deque = new ArrayDeque<>();
            if(n>0){
                for(int j=0; j<sArr.length; j++){
                    deque.offer(sArr[j]);
                }
            }

            int status = 0;
            boolean check = true;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) =='R'){
                    status +=1;
                } else{
                    // 'D' 첫번째인경우
                    if(deque.isEmpty()){
                        check = false;
                        break;
                    } else{
                        if(status % 2== 0){
                            deque.pollFirst();
                        } else{
                            deque.pollLast();
                        }
                    }
                }
            }
            // 출력
            if(check==false){
                result.append("error");
                result.append("\n");
                continue;
            }



            result.append('[');
            if(deque.size() > 0){
                if(status%2==0){
                    result.append(deque.pollFirst());
                    while(!deque.isEmpty()){
                        result.append(",").append(deque.pollFirst());
                    }
                } else{
                    result.append(deque.pollLast());
                    while(!deque.isEmpty()){
                        result.append(",").append(deque.pollLast());
                    }
                }
            }
            result.append(']').append("\n");
        }
        System.out.println(result);

    }
}
