import java.util.*;

public class Main {
    static int n;
    static int m;
    static int k;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        map = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 1; i <= k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = 1;
        }


        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    result = Math.max(result, bfs(i, j, 0));
                }
            }
        }
        System.out.println(result);


    }

    public static int bfs(int x, int y, int count) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            count += 1;
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];

                if (nx <= 0 || nx > n || ny <= 0 || ny > m) {
                    continue;
                }
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    queue.offer(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }

        return count;
    }


    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
