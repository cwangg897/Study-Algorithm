따로 map시간복잡도를 잘몰랐지만 이렇게가 답인거같았다

import java.util.*;

public class Main {
    // 포켓몬의 이름을 보면 포켓몬의 번호를 말하거나,
    // 포켓몬의 번호를 보면 포켓몬의 이름을 말하는 연습을 하도록 하여라.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Map<String, Integer> nameToNumber = new HashMap<>();
       Map<Integer, String> numberToName = new HashMap<>();
       int n = sc.nextInt();
       int m = sc.nextInt();

       sc.nextLine();
       for(int i =0; i<n; i++){
           String s = sc.nextLine();
           nameToNumber.put(s, i+1);
           numberToName.put(i+1, s);
       }

       for(int i=0; i<m; i++){
           String s = sc.nextLine();
           if(Character.isDigit(s.charAt(0))){
               System.out.println(numberToName.get(Integer.parseInt(s)));
           } else{
               System.out.println(nameToNumber.get(s));
           }
       }

    }
}
