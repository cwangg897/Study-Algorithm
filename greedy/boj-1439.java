import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력이 imEmpty인경우
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int zero = 0;
        int one = 0;

        char c = arr[0];
        if(c=='0'){
            zero +=1;
        } else{
            one +=1;
        }

        for(int i=1; i<str.length(); i++){
            if(c==arr[i]){
                continue;
            } else{
                c = arr[i];
                if(c=='0'){
                    zero +=1;
                } else{
                    one +=1;
                }
            }
        }

        System.out.println(Math.min(one, zero));

    }
}
