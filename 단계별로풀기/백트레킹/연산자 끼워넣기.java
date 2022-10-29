먼가 -=1 이 맞나싶었는데 이방법밖에없는거같다. 왜냐 하나가끝나야 +=1이 되기때문에 맞는것이다


import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int[] cal = new int[5];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<=4; i++){
            cal[i] = sc.nextInt();
        }


        dfs(arr[1], 1);
        System.out.println(max);
        System.out.println(min);
    }
    public static void dfs(int num, int count){
        if(count == n){
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for(int i=1; i<=4; i++){
            if(cal[i] == 0){
                continue;
            }

            // 차례대로 덧셈(+)의 개수, 뺄셈(-)의 개수, 곱셈(×)의 개수, 나눗셈(÷)
            // +
            if(i==1){
                cal[i] -=1;
                dfs(num+arr[count+1], count+1);
                cal[i] +=1;
            }
            // -
            if(i==2){
                cal[i] -=1;
                dfs(num-arr[count+1], count+1);
                cal[i] +=1;

            }
            // *
            if(i==3){
                cal[i] -=1;
                dfs(num*arr[count+1], count+1);
                cal[i] +=1;

            }
            // /
            if(i==4){
                cal[i] -=1;
                dfs(num/arr[count+1], count+1);
                cal[i] +=1;
            }

        }
    }

}
