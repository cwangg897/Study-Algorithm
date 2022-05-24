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

        int result= 0;
        int freeCount = 0;
        for(int i=n-1; i>=0; i--){
            if(freeCount==2){
                freeCount = 0;
                continue;
            }
            result += arr[i];
            freeCount++;
        }

        System.out.println(result);


    }
}
// 예제보다 내가 생각한게 맞게 정렬후 큰거끼리 묶으면 큰거 하나공짜니까 이득인부분이다
