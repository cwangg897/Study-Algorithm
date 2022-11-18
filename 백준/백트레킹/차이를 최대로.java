import java.util.*;

public class Main {
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static int n;
    static int max = Integer.MIN_VALUE;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        result = new int[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        dfs(0);
        System.out.println(max);

    }
    public static void dfs(int count){
        if(count == n){
            int cal = cal(result);
            max = Math.max(max, cal);
            return;
        }
        for(int i=0; i< n; i++){
            if(!visited[i]){
                visited[i] = true;
                result[count] = arr[i];
                dfs(count+1);
                visited[i] = false;
            }
        }
    }


    public static int cal(int[] arr ){
        int sum = 0;
        for(int i=0; i<n-1; i++){
            sum += Math.abs(arr[i] - arr[i+1]);
        }
        return sum;
    }

}
