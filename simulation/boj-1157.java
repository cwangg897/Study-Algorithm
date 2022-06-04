import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 단, 대문자와 소문자를 구분하지 않는다.
        char[] str = sc.nextLine().toLowerCase().toCharArray();
        int[] arr = new int[26]; // -97
        for(int i=0; i<str.length; i++){
            char c = str[i];
            arr[c-97] +=1;
        }

        int max = -1;
        boolean ch = false;
        int idx = -1;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(idx == i){
                continue;
            }
            if(arr[idx] == arr[i]){
                ch = true; // 같은것이 있다.
            }
        }

        if(ch){
            System.out.println("?");
        } else{
            String chr = Character.toString((char)(idx+97)).toUpperCase();
            System.out.println(chr);
        }



        // 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.


    }
}

// 다른방법으로는 정렬해서 큰것이 숫자가 같으면 ? 
