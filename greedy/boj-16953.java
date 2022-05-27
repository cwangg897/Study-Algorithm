import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 조건1. 1을 제외한 홀수는 불가능 맨끝자리가 3, 5, 7, 9


        // b를 a로
        // 1을 제거하는것은 10으로 나눈것
        // 나머지가 1이다는걸 확인하는 방법(10으로 나눈 나머지)
        int count = 1;
        while(b>a){
            if(check(b)){
                System.out.println(-1);
                return;
            }
            if(b%10==1){
                b = b/10;
            } else{
                b = b/2;
            }
            count +=1;
        }

        // 출력
        // A를 B로 바꾸는데 필요한 연산의 최솟값에 1을 더한 값을 출력한다.
        if(a==b){
            System.out.println(count);
        } else{
            System.out.println(-1);
        }

    }

  // 이게 왜 나오냐면
  // 10과 1010 과정에서 505 는 a->b로는 불가능하니까
  // 그런데 체크가 왜 1은 되냐 501 이런것도 불가능한데 왜냐하면 a->b로는 1을 붙여줄수있기때문에 3,5,7,9만 배제시키는것이다
    public static boolean check(int num){
        if(num%2==1){
            if(num%10!=1){
                return true;
            }
        }
        return false;
    }

}
