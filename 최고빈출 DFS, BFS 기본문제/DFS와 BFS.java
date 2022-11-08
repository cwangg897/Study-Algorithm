import java.util.*;

public class Main {
    static int n;
    static int m;
    static int v;
    static boolean[] visited;
    static int[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        map = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = 1;
            map[b][a] = 1;
        }
        dfs(v);
        visited = new boolean[n+1];
        System.out.println();
        bfs(v);

    }


    public static void dfs(int v){
        visited[v] = true;
        System.out.print(v+" ");
        for(int i=1; i<=n ;i++){
            if(!visited[i] && map[v][i] == 1){
                dfs(i);
            }
        }
    }

    public static void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.offer(v);
        System.out.print(v+" ");
        while(!queue.isEmpty()){
            int poll = queue.poll();
            for(int i=1; i<=n; i++){
                if(!visited[i] && map[poll][i] == 1 ){
                    queue.offer(i);
                    visited[i] = true;
                    System.out.print(i+" ");
                }
            }
        }
    }
}
