먼가 아무리 생각해도 분수로 만드는걸 계산보다 더쉽게 하는방법이있어서 생각해보니
최대공약수가있었다 알고리즘은 이러한 관계를 파악하는걸 키워야겠다

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int first = arr[0];
        for(int i=1; i<arr.length; i++){
            int gcd = gcd(first, arr[i]);
            System.out.println(first/gcd+"/"+arr[i]/gcd);
        }



    }


    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
