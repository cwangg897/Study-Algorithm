제일 알고리즘 문제다웠다
생각할게 나는항상 dfs로만 생각해서 그경우만 찾고있었는데 안입는경우도 있으니까 물론 dfs로 불가능하다 
조합론이 진짜 답이다  안입는 경우다

이러고 다 안입는경우를 빼주면 되는것이었다

[headgear] : hat, turban, NULL
[eyewear] : sunglasses, NULL

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            Map<String, Integer> map = new HashMap<>();
            int n = sc.nextInt();
            for(int j=0; j<n; j++){
                String a = sc.next();
                String kind = sc.next();
                if(map.containsKey(kind)){
                    map.put(kind, map.get(kind)+1);
                } else{
                    map.put(kind, 1);
                }
            }
            int re = 1;
            for(String key : map.keySet()){
                re *= (map.get(key)+1);
            }
            System.out.println(re-1);
        }

    }
}
