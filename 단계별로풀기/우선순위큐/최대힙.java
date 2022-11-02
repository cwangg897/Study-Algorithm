import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
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
