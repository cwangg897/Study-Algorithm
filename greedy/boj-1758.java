import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        // 돈 - (받은 등수 - 1)
        // 식으로 나온 값이 음수라면, 강호는 팁을 받을 수 없다.
        // 팁최대 받을려면 큰수가 앞으로오면되잖아
        Arrays.sort(arr);
        long result = 0;

        for(int i=0; i<n; i++){
            int addNum = arr[n-i] - i;
            if(addNum<0){
                continue;
            }
            result += addNum;
        }

        System.out.println(result);
    }
}
// 문제를 잘읽자 0보다 적은경우는 더하면안된다.
