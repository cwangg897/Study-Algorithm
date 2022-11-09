물론 변수이름이 숫자가 들어가는데 문제에서 이렇게 딱 막았고 
그리고 한정된 표현식인데 이게 틀린게 말이안된다 
이문제는 진짜 잘못만들었다 자기들이 풀라는방식대로만 푸는것이다

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        String first = str[0];
        for(int i=1; i<str.length; i++){
            String s = str[i];
            String reg = "";
            String name = "";
            for(int j=s.length()-1; j>=0; j--){
                if(s.charAt(j) == '*' || s.charAt(j)=='&'){
                    reg +=s.charAt(j);
                } else if(s.charAt(j) == ']'){
                    reg += '[';
                } else if(s.charAt(j) == '['){
                    reg += ']';
                } else if(('A' <= s.charAt(j) && s.charAt(j) <= 'Z') ||
                ('a' <= s.charAt(j) && s.charAt(j) <='z')){
                    name += s.charAt(j);
                }
            }
            System.out.println(first+reg+" " +name +";");
        }



    }
}
