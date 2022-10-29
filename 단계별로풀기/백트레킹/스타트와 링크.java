n개의 팀에서 만들수있는 조합의수다 
일단 줄일수있는방법이 1,3,7 이렇게나 7,3,1이렇게면 먼저 1을 선택하면 그다음은 무조건 1보다 큰거를 선택하는게 맞을거다
for문을 한번줄이는거다 3,2,1 까지안가고 1,2,3이면 끝나니까 idx를 조절해서 단축가능하다

1,4,3으로 가기전 1,3, 1부터6까지인데 다 경우가 같은경우니까 이전에 세어진다 따라서 이게가능하다


import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static int min = Integer.MAX_VALUE;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        dfs(1, 0);
        System.out.println(min);
    }

    public static void dfs(int idx, int count){
        if(count == n/2){
            int startTeam = 0;
            int linkTeam = 0;
            List<Integer> startList = new ArrayList<>();
            List<Integer> linkList = new ArrayList<>();

            for(int i=1; i<=n; i++){
                if(visited[i]){
                    startList.add(i);
                } else{
                    linkList.add(i);
                }
            }

            for(int i=0; i<startList.size(); i++){
                for(int j=0; j<startList.size(); j++){
                    if(i==j){
                        continue;
                    }
                    startTeam += arr[startList.get(i)][startList.get(j)];
                    linkTeam += arr[linkList.get(i)][linkList.get(j)];
                }
            }

            min = Math.min(min, Math.abs(startTeam - linkTeam));
            return;
        }

        // 이거는 먼가 i=idx+1로해도 상관업을거같은데 순서가필요없으니
        for(int i=idx; i<=n; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i+1, count+1);
                visited[i] = false;
            }
        }


    }
}
