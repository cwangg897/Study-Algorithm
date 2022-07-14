import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static int[] sArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        sArr = new int[m];
        for (int i = 0; i < m; i++) {
            sArr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<m; i++){
            binarySearch(0, n-1, sArr[i]);
        }

    }

    static void binarySearch(int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println(1);
                return;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(0);
    }
}
// 탐색범위가 시간복잡도 계산한다면 이분탐색이 괜찮을 것 같다
