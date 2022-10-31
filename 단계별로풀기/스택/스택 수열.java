문제 이해도 못했고
푸는 방식도 신기했다 당연히 클떄까지넣으면 되는건데 그래서 n번 반복하면되는게 신기하네



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        // 배열의
        int temp = 1;
        boolean check = true;
        // 1부터 8까지 빼내야하니까
        for(int i=1; i<=n; i++){
            int num = sc.nextInt();
            while (temp<num+1){
                stack.add(temp);
                temp +=1;
                sb.append("+");
                sb.append("\n");
            }
            if(stack.peek() == num){
                stack.pop();
                sb.append("-");
                sb.append("\n");
            } else{
                check = false;
            }
        }
        if(!check){
            System.out.println("NO");
        } else{
            System.out.println(sb);
        }


    }
}
