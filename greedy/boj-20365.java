import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int red = 0;
        int blue = 0;
        String str = sc.next();
        char[] arr = str.toCharArray();

        char before = arr[0];

        if(before =='R'){
            red +=1;
        } else{
            blue +=1;
        }

        for(int i=1; i<n; i++){
            char c = arr[i];
            if(before==c){
                continue;
            } else{
                if(c=='R'){
                    red +=1;
                } else{
                    blue +=1;
                }
                before = arr[i];
            }
        }

        int result = Math.min(red, blue);
        System.out.println(result+1);


    }
}
// 나는 처음에 그냥 red blue갯수를 생각해서 +1 을 했는데
// 이웃한것끼리 색칠을 한번으로 하는거니까 묶어야하는것이다 이웃한것이나오면 묶는다 (연속적인게 몇개인지확인한다)
