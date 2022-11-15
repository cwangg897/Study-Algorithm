일단 시간초과가나면 n^2으로 나면은 dp나 정렬을 한번생각
정렬하면 아이디어를 떠올려보자 
앞부분이 정렬되어있으면 n^2을안해도된다.

import java.util.*;

// 일관성을 유지하려면, 한 번호가 다른 번호의 접두어인 경우가 없어야 한다.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        for(int t= 0; t<time; t++){
            int n = sc.nextInt();
            sc.nextLine();
            String[] sArr = new String[n];
            for(int i=0; i<n; i++){
                sArr[i] = sc.nextLine();
            }
            Arrays.sort(sArr);
            boolean check = true;
            for(int i=1; i<n; i++){
                if(sArr[i].startsWith(sArr[i-1])){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }

    }
}
