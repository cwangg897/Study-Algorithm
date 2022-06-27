import java.util.*;

public class Main {
    static int w;
    static int h;

    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {1,-1,0,0,1,1,-1,-1}; // 상 하 좌 우 좌상 우상 좌하 우하
    static int[] dy = {0,0,-1,1,-1,1,-1,1}; // 상 하 좌 우 좌상 우상 좌하 우하
    // 대각선으로 연결되어 있는 사각형은 걸어갈 수 있는 사각형이다.


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0 && h==0){
                break;
            }
            int result = 0;
            map = new int[h][w];
            visited = new boolean[h][w];

            for(int i=0; i<h ; i++){
                for(int j=0; j<w; j++){
                    map[i][j] = sc.nextInt();
                }
            }



            for(int i=0; i<h ; i++){
                for(int j=0; j<w; j++){
                    if(map[i][j] == 1 && !visited[i][j]){
                        visited[i][j] = true;
                        bfs(i,j);
                        result +=1;
                    }
                }
            }
            System.out.println(result);
        }
    }

    public static void bfs(int x, int y) {
        Deque<Node> deque = new ArrayDeque<>();
        Node newNode = new Node(x,y);
        deque.offer(newNode);
        while(!deque.isEmpty()){
            Node pNode = deque.poll();
            for(int i=0; i<dx.length; i++){
                int nx = pNode.getX() + dx[i];
                int ny = pNode.getY() + dy[i];

                if(nx<0 || nx>=h || ny<0 || ny>=w){
                    continue;
                }
                if(!visited[nx][ny] && map[nx][ny]==1){
                    visited[nx][ny] = true;
                    Node node = new Node(nx, ny);
                    deque.offer(node);
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
// 이것도 연결된 요소를 찾는것이다. 그런데 대각선 까지 생객해주어야했다.
