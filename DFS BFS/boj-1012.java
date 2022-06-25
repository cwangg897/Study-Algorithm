import java.util.*;

public class Main {
    static int n;
    static int m;
    static int k;

    static int[][] map ;
    static boolean[][] visited;

    static int[] dx = {0,0,-1,1}; // 상 하 좌 우
    static int[] dy = {1,-1,0,0}; // 상 하 좌 우

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int q=0; q<t; q++){
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();

            map = new int[m][n];
            visited = new boolean[m][n];

            for(int i=0; i<k; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y][x] = 1;
            }

            int count = 0;

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(!visited[i][j] && map[i][j] == 1){
                        count +=1;
                        bfs(i,j);
                    }
                }
            }
            System.out.println(count);
        }




    }

    public static void bfs(int x, int y){
        Deque<Node> deque = new ArrayDeque<>();
        Node vNode = new Node(x,y);
        deque.offer(vNode);
        visited[x][y] = true;
        while(!deque.isEmpty()){
            Node pNode = deque.poll();
            for(int i=0; i<4; i++){
                int nx = pNode.getX() + dx[i];
                int ny = pNode.getY() + dy[i];

                if(nx<0 || nx>=m || ny<0 || ny>=n){
                    continue;
                }
                if(!visited[nx][ny] && map[nx][ny]==1){
                    Node node = new Node(nx, ny);
                    deque.offer(node);
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static class Node {
        public int x;
        public int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return this.x;
        }

        public int getY(){
            return this.y;
        }
    }
}
