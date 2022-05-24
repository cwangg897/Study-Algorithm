import java.util.*;

public class Main {
    static int[] arr = {500, 100, 50, 10, 5, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1000원 냈을때 잔돈의 개수
        int re = 1000 - n;

        int count = 0; // 잔돈개수

        for(int i=0; i<arr.length; i++){
            count += re / arr[i];
            re = re%arr[i];
        }

        System.out.println(count);

    }
}
