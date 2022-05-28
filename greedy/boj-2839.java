import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        // 해결방안.
        //5로 안나누어지면 3을 빼기
        //5로 나누어지면 5나누기
        while(n>=3){
            if(n%5!=0){
                n = n - 3;
                count +=1;
            } else{
                n = n - 5;
                count +=1;
            }
        }

        if(n==0){
            System.out.println(count);
        } else{
            System.out.println(-1);
        }




        // 출력 조건. 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.

    }

}
