import java.util.*;

public class Main {
    static int[] arr;
    static List<String> list = new ArrayList<>();
    static boolean[] visited;
    static int n;



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        dfs("", 0);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }

    public static void dfs(String str, int count){
        if(count == n){
            list.add(str);
            return;
        }
        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(str+arr[i]+" ", count+1);
                visited[i] = false;
            }


        }
    }
}
