import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            String str = sc.next();
            if(check(str)){
                count +=1;
            }
        }
        System.out.println(count);
    }

    static boolean check(String str){
        boolean[] arr = new boolean[26];
        arr[str.charAt(0)-97] = true;
        char before = str.charAt(0);

        for(int i=1; i<str.length(); i++){
            char current = str.charAt(i);
            if(before!=current){
                if(arr[current-97]){
                    return false;
                } else{
                    arr[current-97] = true;
                }
            }
            before = current;
        }
        return true;
    }
}
