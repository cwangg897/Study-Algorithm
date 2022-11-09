문제를 보면 처음에 dfs + bfs로 풀려고했으나 틀렸고
그래서 좌표가이미있다 따라서
좌표가있으니 치킨집선택한거해서 city돌려서 구했다


import java.util.*;

public class Main {
    static int n;
    static int m;

    static ArrayList<Node> city = new ArrayList<>();
    static ArrayList<Node> chicken = new ArrayList<>();

    static int[][] map;
    static boolean[] visited;

    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                map[i][j] = sc.nextInt();
                if(map[i][j] == 2){
                    chicken.add(new Node(i,j));
                } else if(map[i][j] == 1){
                    city.add(new Node(i,j));
                }
            }
        }
        visited = new boolean[chicken.size()];
        dfs(0, 0);
        System.out.println(result);

    }

    public static void dfs(int idx, int count){
        if(count == m){
            int sum = 0;
            for(int i=0; i< city.size(); i++){
                int num = Integer.MAX_VALUE;
                for(int j=0; j< chicken.size(); j++){
                    if(visited[j]){
                        int cal = Math.abs(city.get(i).x - chicken.get(j).x) + Math.abs(city.get(i).y - chicken.get(j).y);
                        num = Math.min(num, cal); // 좌표별 최소
                    }
                }
                sum +=num;
            }
            result = Math.min(result, sum);
            return;
        }

        for(int i=idx; i<chicken.size(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i+1, count+1);
                visited[i] = false;
            }
        }

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
