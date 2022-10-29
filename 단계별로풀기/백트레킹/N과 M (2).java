수열들이 오름차순이어야하니까 다음부터 체크하도록했다 

import java.util.*;

public class Main {
    static boolean[] visited;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt(); // 세는거
        visited = new boolean[n+1];
        dfs("", 0, 0);
    }

    public static void dfs(String str, int count, int idx){
        if(count == m){
            System.out.println(str);
            return;
        }

        for(int i=idx+1; i<=n; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(str+i+" ", count+1, i);
                visited[i] = false;
            }
        }
    }
}
