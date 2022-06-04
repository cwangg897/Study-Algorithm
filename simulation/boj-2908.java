import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        String[] b = sc.next().split("");
        StringBuilder sbA = new StringBuilder();
        StringBuilder sbB = new StringBuilder();
        for(int i=a.length-1; i>=0; i--){
            sbA.append(a[i]);
        }

        for(int i=b.length-1; i>=0; i--){
            sbB.append(b[i]);
        }
        int result = Math.max(Integer.parseInt(sbA.toString()), Integer.parseInt(sbB.toString()));
        System.out.println(result);
    }
}
