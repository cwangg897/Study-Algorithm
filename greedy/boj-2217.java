import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 모든 로프를 사용해야 할 필요는 없으며
        // 일단배열로하고 1개 돌리고 2배수 돌리고 3배수 돌려보자
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        // 인덱스를 1부터 시작하는걸로 하자
        Arrays.sort(arr); // 오름차순인디..
        long result = 0;
        for(int i=1; i<=n; i++){
            result = Math.max(result, arr[arr.length-i]*i);
        }

        System.out.println(result);
        // 10000000000
    }
}
