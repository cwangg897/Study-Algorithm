이항계수 구하는법을 알게되었다

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // n! / (n-k)! * k!
        int num = factorial(n) / (factorial(n-k) * factorial(k));
        System.out.println(num);



    }

    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
