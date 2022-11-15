 메모리 초과가 발생해버린다.
 그 이유는 자바의 String은 불변(immutable)이라서 값을 바꿀때마다 매번 새로운 String을 할당하기 때문이다.
 문자열 문제에서 메모리초과는 String의 불변성을 생각하자 항상

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String boom = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i));
            if(sb.length() >= boom.length()){
                boolean check = true;
                for(int j=0; j<boom.length(); j++){
                    if(sb.charAt(sb.length() - boom.length() + j) != boom.charAt(j)){
                        check = false;
                        break;
                    }
                }
                if(check){
                    sb.delete(sb.length() - boom.length(), sb.length());
                }
            }
        }
        if(sb.length() == 0){
            System.out.println("FRULA");
        } else{
            System.out.println(sb);
        }

        
    }
}
