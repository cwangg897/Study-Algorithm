일직선이면 가운데에 위치하면 거리의 차이가 최소가됩니다.
중간값을 찾으면됩니다.
그런데 왜 배열을 0부터 받느냐 n+1로 하면 0이 포함되서 정렬이 0도 들어가서 이상해진다
그래서 0부터시작하니까 -1을 해주는것이고
일직선이라 짝수인경우 왼쪽 오른쪽 똑같다 그래서 작은값을위해서 하는것이다


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
        if(n%2==0){
            System.out.println(arr[(n/2)-1]);
        } else{
            System.out.println(arr[n/2]);
        }



    }
}
