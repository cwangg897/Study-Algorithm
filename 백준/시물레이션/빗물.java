처음에 이렇게 풀었는데
3 0 1 0 4인 경우를 보면 1에서 크니까 3 0 1에 차는것만세는데 실제로는 0에 3개가 찬다 그림으로 그려보면안다.
  그래서 양옆으로 큰것을 찾는것이다

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 세로
        int w = sc.nextInt(); // 가로 입력되는거
        int[] arr = new int[w];
        for(int i=0; i<w; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int first = arr[0];
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=1; i<w-1; i++){
            // 이전것보다 같거나 크고 다음것보다 같거나 커야함
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                int min = Math.min(first, arr[i]);
                while (!queue.isEmpty()){
                    int num = min - queue.poll();
                    count +=num;
                }
                first = arr[i];
            } else{
                queue.offer(arr[i]);
            }
        }

        if(!queue.isEmpty()){
            int min = Math.min(first, arr[arr.length-1]);
            while (!queue.isEmpty()){
                int num = min - queue.poll();
                count +=num;
            }
        }
        System.out.println(count);


    }
}


------------------------------
 첫번째와 미지막은 물이 차는경우느 없다 경우를 나눠서 그림으로 그려보면 알수있는데 즉 첫번쨰와 마지막은 계산할필요없이
 중간부분계산하는데
 leftMax, rightMax = current로 해줘야하는게 중요포인트다
 좌우로 가장큰 값을 찾는데 자기가 가장클수도있는경우도있으니
 시물레이션은 경우를 찾아서 만들어주는게 중요하다
 
 import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); // 세로
        int w = sc.nextInt(); // 가로 입력되는거
        int[] arr = new int[w];
        for(int i=0; i<w; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=1; i<w-1; i++) {
            int current = arr[i];
            // 왼쪽으로 가장큰거
            int leftMax = current;
            for(int j=i-1; j>=0; j--){
                leftMax = Math.max(leftMax, arr[j]);
            }
            // 오른쪽으로 가장큰거
            int rightMax = current;
            for(int j=i+1; j<w; j++){
                rightMax = Math.max(rightMax, arr[j]);
            }
            int min = Math.min(leftMax, rightMax);
            count += min - current;
        }

        System.out.println(count);
    }
}
