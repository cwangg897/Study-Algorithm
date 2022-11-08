import java.util.*;

public class Main {
    static int n;
    static int k;
    static int[] map = new int[100001];
    static int result = 0;

    static int time = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        bfs(n);
        System.out.println(map[k]); // 최단거리
        System.out.println(result);
    }

    public static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        map[x] = 0;

        while (!queue.isEmpty()){
            int poll = queue.poll();

            if(poll == k){
                if(result ==0){
                    time = map[k];
                }
                // 아래에서 거리가 같은경우니까 여기서는 result만 넣고 continue는 만약 찾아는데 계속 진행할 필요도 없으니까 
                result+=1;
                continue;
            }

            int[] arr = {poll-1, poll+1, poll*2};
            for(int i=0; i<3; i++){
                int nx = arr[i];
                if(nx<0 || nx>100000) continue;

                // 최초 방문이거나 중복인데 거리가 같은경우 넣어주는거지 
                if(map[nx] == 0 ||  map[poll]+1 == map[nx]){
                    map[nx] = map[poll] +1;
                    queue.offer(nx);
                }

            }

        }
    }
}
