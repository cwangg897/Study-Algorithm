억까당했다
Scanner 이랑 sout를 자주하면 성능이 떨어져 시간초과가 났다
그래서 배열을 통해서 숫자를 저장하는데 arr을 다시 new int[] 로안해도되는이유가 어차피 매번 숫자는 초기화되기떄문이다.
  arr[1] = 2   arr[2] = for문 


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
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int count){
        if(count == m){
            for(int i=1; i<=m; i++){
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=1; i<=n; i++){
            arr[count+1]  = i;
            dfs(count+1);
        }
    }
}
