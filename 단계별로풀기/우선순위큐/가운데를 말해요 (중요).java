{1}
{1,5}
{1,2,5}
{1,2,5,10}
{-99,1,2,5,7,10} 이렇게 가는데 항상 가운데가 걸린다
그래서 PQ를 2개 사용해서 하나는 내림차순 하나는 오름차순 으로 해서 붙이는것과같이 한다
만약 사이즈가 같다면 넣고 만약 비어있지않고 {[1,5],[3,10]}  이렇게 되는경우가있으니 바꿔주는 것이다


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 오름차순
                return o2 - o1;
            }
        });
        PriorityQueue<Integer> minPq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 내림차순
                return o1-o2;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<t; i++){
            int num = sc.nextInt();
            if(maxPq.size() == minPq.size()){
                maxPq.add(num);

                if(!minPq.isEmpty() && maxPq.peek() > minPq.peek()){
                    maxPq.add(minPq.poll());
                    minPq.add(maxPq.poll());
                }
            } else{
                minPq.add(num);

                if(maxPq.peek() > minPq.peek()){
                    maxPq.add(minPq.poll());
                    minPq.add(maxPq.poll());
                }

            }
            sb.append(maxPq.peek()).append("\n");
        }
        System.out.println(sb);

    }
}
