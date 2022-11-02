음 우선순위이지만 처음에 pq를 2개사용하려다가 문제를 다시 읽어보니 정렬을 기준을 만들면되는거였다

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)){
                    return o1 - o2;
                } else{
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            if(n==0){
                Integer num = pq.poll();
                if(num ==null ){
                    sb.append(0).append("\n");
                } else{
                    sb.append(num).append("\n");
                }

            } else{
                pq.offer(n);
            }

        }
        System.out.println(sb);
    }
}
