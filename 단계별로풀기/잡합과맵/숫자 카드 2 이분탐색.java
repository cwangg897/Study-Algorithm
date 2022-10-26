 시간복잡도가 넘어가는거 보니 이분탐색이지만 중복이 있어서
 lowerBound, uppderBound를 사용하는것이다 그런데 이부분이 
 기존 이분탐색과는 다르게 진행해야한다 복습하자

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            int num = sc.nextInt();
            int up = upperBound(arr, num);
            int lo = lowerBound(arr, num);
           sb.append(up - lo);
           sb.append(" ");
        }
        System.out.println(sb);



    }
    public static int lowerBound(int[] arr , int target){
        int l = 0;
        int r = arr.length;
        while(l<r){
            int mid = (l+r) / 2;

            if(target <= arr[mid]){
                r =  mid;
            } else{
                l = mid+1;
            }
        }
        return l;
    }

    public static int upperBound(int[] arr, int target){
        int l = 0;
        int r = arr.length;
        while (l<r){
            int mid = (l+r) / 2;
            if(target < arr[mid]){
                r = mid;
            } else{
                l = mid+1;
            }
        }
        return l;
    }
}
