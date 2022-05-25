import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        // 1,2,3,4,5
        // n=5
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long maxNum = 0;

        if(n%2==0){
            // 1,2,3,4,5,6
            for(int i=0; i<n/2; i++){
                maxNum = Math.max(maxNum, arr[i] + arr[n-i-1]);
            }
        } else{
            maxNum = arr[n-1];
            // 1,2,3,4,5
            // 홀수면 제일큰거를 제외하고 그전에것을 짝수처럼해서 계산하면됨
            for(int i=0; i<(n-1)/2; i++){
                maxNum = Math.max(maxNum, arr[i] + arr[n-i-2]);
            }
        }

        System.out.println(maxNum);
        // 나는 홀수 짝수를 생각못했음


    }
}
