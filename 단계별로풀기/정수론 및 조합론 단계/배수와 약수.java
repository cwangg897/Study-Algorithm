import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0 && b==0){
                break;
            }

            // 첫번째 숫자가 두번째 숫자의 약수이다
            if(b%a ==0 ){
                System.out.println("factor");
                // 첫번째 숫자가 두번째 숫자의 배수이다
            } else if((a%b) == 0){
                System.out.println("multiple");
            } else{
                System.out.println("neither");
            }


        }
    }
}
