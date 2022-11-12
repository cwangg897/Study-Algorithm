아무리 생각해도 우선순위 큐인거같았는데 너무쉽게풀려버렸다

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            pq.offer(sc.nextInt());
        }
        int sum = 0;
        while(pq.size()>=2){
            int first = pq.poll();
            int second = pq.poll();
            int hap = first + second;
            sum += hap;
            pq.offer(hap);
        }
        System.out.println(sum);


    }
}
