단순 구현이다


import java.util.*;

public class Main {
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // 시작 위치
        for(int i=0; i<str.length(); i++){
            // 범위
            for(int j=0; j<str.length(); j++){
                if(i+j == str.length()){
                    break;
                }
                // 완성
                StringBuilder sb = new StringBuilder();
                for(int k=i; k<=i+j; k++){
                    sb.append(str.charAt(k));
                }
                set.add(sb.toString());
            }
        }
        System.out.println(set.size());
    }
}
