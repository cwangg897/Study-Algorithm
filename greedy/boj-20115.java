import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Float> list = new LinkedList<>();


        for(int i=0; i<n; i++){
            list.add(sc.nextFloat());
        }
        Collections.sort(list);

        // 제일 작은거 큰거 식으로가야하는데 어케하지
        for(int i=0; i<n-1; i++){
            float l = list.remove(0);
            float h = list.remove(list.size()-1);
            list.addLast((l/2)+h);
        }
        System.out.println(list.getFirst());



    }
}
// 오차 허용한다는거니까 0이나 이런거 
