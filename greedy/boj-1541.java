import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("-");
        int[] arr = new int[str.length];
        // 처음과 마지막 문자는 숫자이다.

        for(int i=0; i<str.length; i++){
            String[] strings = str[i].split("\\+");
            int sum = 0;
            for(int j=0; j<strings.length; j++){
                sum += Integer.parseInt(strings[j]);
            }
            arr[i] = sum;
        }

        int result = arr[0];
        for(int i=1; i<arr.length; i++){
            result += arr[i]*-1;
        }
        

        System.out.println(result);

        
    }
}
// 더하기를 먼저하면 되는거니까 그런데 처음과 마지막 문자는 숫자인걸 중요하게 
