방법을 생각해보면 무조건 dfs말고없었다
그러나 시간단축이었다
dfs시간단축은 초기에 return을 하거나 이전에 조사했던걸 조사안하는
핵심 로직은 아래와 같다고 생각한다 이전에것을 탐색할필요가없다
중복이아니고 그리고 이미 순서대로 진행되었기때문에

그리고 replace를 해주면 더 탐색속도가 빨라진다 범위를 줄였기때문이다
for문에서 반복되는부분을 줄이는방법이다 그냥해도 성공한다
핵심은 아래로직이기때문이다


        for(int i=idx+1; i<26; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i, len+1);
                visited[i] = false;
            }
        }



import java.util.*;

public class Main {
    static boolean[] visited;
    static String[] str;
    static int max = 0;
    static int n;
    static int k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();
        str = new String[n];
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            s = s.replace("anta", "");
            s = s.replace("tica", "");
            str[i] = s;
        }
        if(k<5){
            System.out.println(0);
            return;
        } else if(k==26){
            System.out.println(n);
            return;
        }
        visited = new boolean[26];
        // a,n,t,i,c 는 무조건
        visited['a' - 97] = true;
        visited['n' - 97] = true;
        visited['t' - 97] = true;
        visited['i' - 97] = true;
        visited['c' - 97] = true;
        dfs(-1, 0);
        System.out.println(max);

    }

    public static void dfs(int idx, int len){
        if(len == k-5){
            int count = 0;
            for(int i=0; i< str.length; i++){
                String s = str[i];
                boolean check = true;
                for(int j=0; j<s.length(); j++){
                    if(!visited[s.charAt(j) - 97]){
                        check = false;
                        break;
                    }
                }
                if(check){
                    count +=1;
                }
            }
            max = Math.max(max, count);
            return;
        }
        for(int i=idx+1; i<26; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i, len+1);
                visited[i] = false;
            }
        }

    }
}
