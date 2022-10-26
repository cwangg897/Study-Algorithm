list로 해도 시간복잡도 계산해보니 안넘는다 그래서 해보니 된다 
문제에서 중복된게 없다고해서 list로도 가능한것이다 그렇지 않다면 set이다 

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(sc.nextLine());
        }
        int answer = 0;

        for(int i=0; i<m; i++){
            if(set.contains(sc.nextLine())){
                answer+=1;
            }
        }
        System.out.println(answer);
    }
}
