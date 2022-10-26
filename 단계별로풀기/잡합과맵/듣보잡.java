String이면 이분탐색이 불가능한건가?

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            set.add(s);
        }

        for(int i=0; i<m; i++){
            String s = sc.nextLine();
            if(set.contains(s)){
                result.add(s);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int i=0; i< result.size(); i++){
            System.out.println(result.get(i));
        }



    }
}
