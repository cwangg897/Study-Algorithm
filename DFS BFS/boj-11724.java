import java.util.*;

public class Main {
    static int n;
    static int m;

    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 정점의 개수
        m = sc.nextInt(); // 간선의 개수

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        int result = 0;
        for(int i=1 ;i<=n; i++){
            if(!visited[i]){
                visited[i] = true;
                bfs(i);
                result+=1;
            }
        }
        System.out.println(result);





    }
    public static void bfs(int v){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(v);
        while(!deque.isEmpty()){
            int poll = deque.poll();
            for(int i=1; i<=n; i++){
                if(!visited[i] && graph[poll][i] == 1){
                    deque.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
// 매우간단한 연결된 요소 개수를 찾는것이었다. 좌표상으로 연결된 개수를 구하는거랑 같다
