일단 시간복잡도상 불가능한걸 알았고 다른방법을 찾아야하는데
식을 도출하는것이고 그 식이 무엇을 의미하는지 도출하는게 생각도못했다


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
        // 최대공약수찾기
        int gcd = Math.abs(arr[0] - arr[1]);
        for(int i=2; i<arr.length; i++){
            gcd = gcd(gcd, Math.abs(arr[i-1] - arr[i]));
        }

        for(int i=2; i<=gcd; i++){
            if(gcd % i == 0){
                System.out.print(i+" ");
            }
        }


    }


    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
