분노로만 가득하다 문제가 안풀린다 
생각이 안된다 문제를 보고 시간복잡도를 본다 숫자를 찾는것은 탐색이다 그중 순차탐색도있지만 시간복잡도를 보니 넘어가서 이분탐색을하는것이다

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

        StringBuilder sb = new StringBuilder();
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            int num = sc.nextInt();
            sb.append(binarySearch(arr, num));
            sb.append(" ");
        }
        System.out.println(sb.toString());

    }

    public static int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int mid = (l+r) / 2;
            if(arr[mid] == target){
                return 1;
            }

            if(arr[mid] < target){
                l =  mid+1;
            } else{
                r = mid - 1;
            }
        }
        return 0;

    }

}
