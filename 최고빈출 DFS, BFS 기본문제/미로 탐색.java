import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        map = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];
        for(int i=1; i<=n; i++){
            String str = sc.nextLine();
            for(int j=0; j<str.length(); j++){
                map[i][j+1] = Character.getNumericValue(str.charAt(j));
            }
        }
        bfs(1,1);
        System.out.println(map[n][m]);

    }

    public static void bfs(int x, int y){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        visited[x][y] = true;
        while(!queue.isEmpty()){
            Node poll = queue.poll();
            if(poll.x == n && poll.y ==m){
                return;
            }
            for(int i=0; i<4; i++){
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if(nx<=0 || nx>n || ny<=0 || ny>m){
                    continue;
                }
                if(!visited[nx][ny] && map[nx][ny] ==1){
                    map[nx][ny] = map[poll.x][poll.y] +1;
                    queue.offer(new Node(nx,ny));
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
