import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty()) {
                    if (str.charAt(j) == ')') {
                        stack.add(')');
                        check = false;
                    } else{
                        stack.add('(');
                    }
                } else{
                    if(str.charAt(j) == ')'){
                        stack.pop();
                    } else {
                        stack.add('(');
                    }
                }
            }
            if(stack.isEmpty() && check){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

        }


    }
}
