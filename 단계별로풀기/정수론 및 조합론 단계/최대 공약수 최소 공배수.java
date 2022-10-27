gcd를 사용하는방법과  한쪽이 0이될떄까지
lcm = 두수의 곱 / 최대공약수


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcdNum = gcd(a,b);
        int lcmNum = (a*b)  / gcd(a,b);
        System.out.println(gcdNum);
        System.out.println(lcmNum);


    }

    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
