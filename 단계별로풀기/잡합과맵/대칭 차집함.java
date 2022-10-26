매우 쉬웠다

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        for(int i=0; i<n; i++){
            A.add(sc.nextInt());
        }

        for(int i=0; i<m; i++){
            B.add(sc.nextInt());
        }

        // A만 구할려면 A원소 돌리면서 B에 들어있다면 빼야함
        int bCount = 0;

        Iterator<Integer> iteratorA = A.iterator();
        while(iteratorA.hasNext()){
            int num = iteratorA.next();
            if(B.contains(num)){
                bCount +=1;
            }
        }
        int aResult = A.size() - bCount ;

        int aCount = 0;
        Iterator<Integer> iteratorB = B.iterator();
        while (iteratorB.hasNext()){
            int num = iteratorB.next();
            if(A.contains(num)){
                aCount+=1;
            }
        }
        int bResult = B.size() - aCount;
        System.out.println(aResult + bResult);


    }
}
