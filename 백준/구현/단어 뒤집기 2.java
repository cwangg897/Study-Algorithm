사실 거꾸로가 나오면 스택을 사용하자
< 이면 상태를 바꿔서 그대로 출력하고
아닌경우 또 공백인지아닌지에 따라 나눠서 처리하면된다.


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder sp = new StringBuilder();
        boolean check = true;
        for(int i=0; i<str.length(); i++){
            char cur = str.charAt(i);
            if(cur == '<'){
                check = false;
                sb.append(sp.reverse());
                sb.append('<');
                sp = new StringBuilder();
            } else if(cur == '>'){
                sb.append(sp);
                sb.append('>');
                check = true;
                sp = new StringBuilder();
            } else if(!check && cur ==' '){
                sp.append(cur);
            } else if(cur == ' '){
                sb.append(sp.reverse());
                sb.append(' ');
                sp = new StringBuilder();
            } else{
                sp.append(cur);
            }
        }
        if(sp.length()>1){
            sb.append(sp.reverse());
        }
        System.out.println(sb);


    }
}
