import java.util.*;

public class Main {
    static int n;
    static int m;
    static boolean[][] visited;
    static char[][] map;

    static int wSum = 0;
    static int bSum = 0;
    static int count = 0;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 가로
        m = sc.nextInt(); // 세로
        sc.nextLine();
        map = new char[m+1][n+1];
        visited = new boolean[m+1][n+1];

        for(int i=1; i<=m; i++){
            String str = sc.nextLine();
            for(int j=0; j<str.length(); j++){
                map[i][j+1] = str.charAt(j);
            }
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(!visited[i][j] && map[i][j] =='W'){
                    bfs(i, j, 'W');
                    wSum += (count*count);
                    count = 0;
                }
                if(!visited[i][j] && map[i][j] =='B'){
                    bfs(i, j, 'B');
                    bSum += (count*count);
                    count = 0;
                }
            }
        }
        System.out.println(wSum+" "+bSum);

    }

    public static void bfs(int x, int y, char c){
        Queue<Node> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.offer(new Node(x, y));
        while(!queue.isEmpty()){
            count +=1;
            Node poll = queue.poll();
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if(nx <= 0 || nx>m || ny<=0 || ny>n){
                    continue;
                }

                if(!visited[nx][ny] && map[nx][ny] == c){
                    queue.offer(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }

    static class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
