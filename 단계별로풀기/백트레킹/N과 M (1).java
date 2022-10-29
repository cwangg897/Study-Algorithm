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
        dfs("", 0);

    }

    public static void dfs(String str, int count){
        if(count == m){
            System.out.println(str);
            return;
        }

        for(int i=1; i<=n; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(str+i+" ", count+1);
                visited[i] = false;
            }
        }
    }
}
