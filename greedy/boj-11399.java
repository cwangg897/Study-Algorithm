import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int accumulate = 0;
        int count = 0; // 총 기다린시간
        // 1,2,3,3,4
        for(int i=0; i<n; i++){
            accumulate += arr[i]; // 3
            count += accumulate;
        }
        System.out.println(count);

    }
}
// 처음시간 누적안시켜주는알았는데 시켜준다 그리고 마지막시간도 진행된거 더해줘야해서 이렇게해도 상관없음
// 더 좋은코드라면 첫번째 초기화 해주고 1~n-1까지 하고 마지막에 n번째 시간을 더하는것도 괜찮은 방법이다
