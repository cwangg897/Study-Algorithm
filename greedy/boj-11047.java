import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        // 정답틀리면 수학적으로 계산하기
        for(int i=n-1; i>=0; i--){
            if(arr[i] <= k ){
                count += k / arr[i];
                k = k%arr[i];
            }
        }
        System.out.println(count);


    }
}

// 당위성, 오름차순 
