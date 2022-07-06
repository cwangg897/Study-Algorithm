import java.util.*;

public class Main {
    static int n;
    static int m;
    static String[][] map;
    static boolean[][] visited;

    static int[] dx = {1,-1,0,0}; // 상 하 좌 우
    static int[] dy = {0,-0,-1,1}; // 상 하 좌 우

    static int bCount = 0;
    static int wCount = 0;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new String[m][n];
        visited = new boolean[m][n];

        for(int i=0;i<m; i++){
            String[] str = sc.next().split("");
            for(int j=0; j<str.length; j++){
                map[i][j] = str[j];
            }
        }

        for(int i=0;i<m; i++){
            for(int j=0; j<n; j++){
                if(map[i][j].equals("W") && !visited[i][j]){
                    bfsW(i,j);
                    wCount += count * count;
                    count = 0;
                }

                if(map[i][j].equals("B") && !visited[i][j]){
                    bfsB(i,j);
                    bCount += count * count;
                    count = 0;
                }
            }
        }

        System.out.println(wCount +" "+ bCount);

    }

    static void bfsW(int x, int y){
        Deque<Node> deque = new ArrayDeque<>();
        Node fNode = new Node(x,y);
        visited[x][y] = true;
        count +=1;
        deque.offer(fNode);
        while(!deque.isEmpty()){
            Node pNode = deque.poll();
            for(int i=0; i<4; i++){
                int nx = pNode.getX() + dx[i];
                int ny = pNode.getY() + dy[i];

                if(nx<0 || nx>=m || ny<0 || ny>=n){
                    continue;
                }

                if(map[nx][ny].equals("W") && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    count +=1;
                    Node newNode = new Node(nx, ny);
                    deque.offer(newNode);
                }
            }
        }
    }

    static void bfsB(int x, int y){
        Deque<Node> deque = new ArrayDeque<>();
        Node fNode = new Node(x,y);
        visited[x][y] = true;
        count +=1;
        deque.offer(fNode);
        while(!deque.isEmpty()){
            Node pNode = deque.poll();
            for(int i=0; i<4; i++){
                int nx = pNode.getX() + dx[i];
                int ny = pNode.getY() + dy[i];

                if(nx<0 || nx>=m || ny<0 || ny>=n){
                    continue;
                }

                if(map[nx][ny].equals("B") && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    count +=1;
                    Node newNode = new Node(nx, ny);
                    deque.offer(newNode);
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
