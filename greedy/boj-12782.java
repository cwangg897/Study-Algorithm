import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String[] s1 = sc.next().split("");
            String[] s2 = sc.next().split("");

            int result = 0;

            int oneS1 = 0;
            int oneS2 = 0;


            int diff = 0;

            for(int j=0; j<s1.length; j++){
                if(!s1[j].equals(s2[j]) ){
                    diff +=1;
                }
                if(s1[j].equals("1")){
                    oneS1 +=1;
                }
                if(s2[j].equals("1")){
                    oneS2 +=1;
                }
            }

            int diffNumber = Math.abs(oneS1-oneS2);
            result += diffNumber;
            diff -= diffNumber;
            result += diff/2;
            System.out.println(result);
        }



    }
}
// 1. 1과0다른거 숫자변환
// 2. 자리교체는 숫자변환하고 다른개수 / 2 를 해주면된다.
