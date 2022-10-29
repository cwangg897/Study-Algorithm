자기부터 진행하면 되는것이다 

import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt(); // 세는거
        arr = new int[m+1];
        dfs(0, 1);
        System.out.println(sb);
    }

    public static void dfs(int count, int idx){
        if(count == m){
            for(int i=1; i<=m; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=idx; i<=n; i++){
            arr[count+1]  = i;
            dfs(count+1, i);
        }
    }
}
