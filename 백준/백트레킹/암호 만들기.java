import java.util.*;

public class Main {
    static int l;
    static int c;
    static char[] arr;
    static boolean[] visited;
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        c = sc.nextInt();
        arr = new char[c];
        visited = new boolean[c];
        for (int i = 0; i < c; i++) {
            arr[i] = sc.next().charAt(0);
        }
        Arrays.sort(arr);
        dfs("", 0, 0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // 중복 허용x이고
    // a, e, i, o, u 최소 한개이상포함
    //
    public static void dfs(String str, int idx, int count) {
        if (count == l) {
            int mCount = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    mCount += 1;
                }
            }
            if (mCount >= 1 && str.length() - mCount >= 2) {
                list.add(str);
            }
            return;
        }

        for (int i = idx; i < arr.length; i++) {
//            if (!visited[i]) {
//                visited[i] = true;
//                dfs(str + arr[i], i + 1, count + 1);
//                visited[i] = false;
//            }
            dfs(str + arr[i], i + 1, count + 1);
        }

    }

}
