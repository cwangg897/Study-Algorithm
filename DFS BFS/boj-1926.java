import java.util.*;

public class Main {
    static int h;
    static int w;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {1,-1,0,0}; // 상 하 좌 우
    static int[] dy = {0,-0,-1,1}; // 상 하 좌 우

    static int count = 0;
    static int max = 0;
    static int mCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        map = new int[h][w];
        visited = new boolean[h][w];

        for(int i=0;i<h; i++){
            for(int j=0; j<w; j++){
                map[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<h; i++){
            for(int j=0; j<w; j++){
                mCount = 0;
                if(map[i][j] == 1 && !visited[i][j]){
                    bfs(i, j);
                    count +=1;
                }
                if(mCount > max){
                    max = mCount;
                }

            }
        }

        System.out.println(count);
        System.out.println(max);
    }

    public static void bfs(int x, int y){
        Deque<Node> deque = new ArrayDeque<>();
        Node fNode = new Node(x,y);
        deque.offer(fNode);
        visited[x][y] = true;
        mCount +=1;

        while(!deque.isEmpty()){
            Node pNode = deque.poll();
            for(int i=0; i<4; i++){
                int nx = pNode.getX() + dx[i];
                int ny = pNode.getY() + dy[i];

                if(nx<0 || nx>=h || ny<0 || ny>=w){
                    continue;
                }
                if(map[nx][ny]==1 && !visited[nx][ny]){
                    Node newNode = new Node(nx,ny);
                    deque.offer(newNode);
                    visited[nx][ny] = true;
                    mCount +=1;
                }
            }

        }
    }

    static class Node{
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
// 음 문제가 됬던건 nx ny 를 바꿔서 해봤는데 내가 pNode.getX() pNode.getY()이부분에서 실수했다 이값이들어갔으면안됬는데
