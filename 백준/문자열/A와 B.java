StringBuilder는 toString해줘야한다 안그러면 Object라서 Objcet비교를해버림 
String과 Object의 eqauls는다르다
toString붙여줘야하는거였음 개억까문제였음
중요한게 문제를 잘 읽자



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder t = new StringBuilder(sc.nextLine());
        while(t.length() != s.length()){
            if(t.charAt(t.length()-1) == 'A'){
                t.deleteCharAt(t.length()-1);
            } else if(t.charAt(t.length()-1) == 'B'){
                t.deleteCharAt(t.length()-1);
                t.reverse();
            }
        }

        if(t.toString().equals(s)){
            System.out.println(1);
        } else{
            System.out.println(0);
        }

    }
}
