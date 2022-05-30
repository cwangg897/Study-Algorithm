import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 총개수
        int k = sc.nextInt(); // 바구니개수
        long sum = k*(k+1) / 2;

        if(n<sum){ // 최소 개수 만들수있는거
            System.out.println(-1);
        } else{
            long r = n-sum;
            if(r%k==0){
                System.out.println(k-1);
            } else{
                System.out.println(k);
            }
        }

    }
}
// 1 2 3 = 차이 2
// 1 2 4  = 차이 3
// 1 3 4  = 차이 3
// 2 3 4  = 차이 2
// 이러한 규칙을 이용해서 사용하는것이다. 
// 다른풀이들은다 최소한의 개수를 이상하게하는데 나는 1부터 k까지의 합의 개수로 구한다.
