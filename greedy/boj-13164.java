import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        int[] diff =  new int[n-1];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0; i<n-1; i++){
            diff[i] = arr[i+1] - arr[i];
        }
        Arrays.sort(diff);
        // 1 3 5 6 10
        // n=5 k=3
        for(int i=0; i<n-k; i++){
            result += diff[i];
        }
        System.out.println(result);

    }
}
// 행복유치원 나도 일단은 차이를 이용하는것은 알았지만 왜그런지 정당한 이유를 못구했다. n-k가 왜 나왔는지는 감으로알았지
// 당위성을 부여하는방법을 공부하자
// n-k는 그룹수 내가 직접 합쳐보면서 했어야했다 그림으로 그리면서 푸는게 매우 힌트를얻기 
