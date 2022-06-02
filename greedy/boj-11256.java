import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int count = 0;
            int j = sc.nextInt();
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int k=0; k<n; k++){
                int r = sc.nextInt();
                int c = sc.nextInt();
                arr[k] = r*c;
            }
            Arrays.sort(arr);

            for(int k=n-1; k>=0; k--){
                if(j>0){
                    int get = arr[k];
                    j -= get;
                    count +=1;
                } else{
                    break;
                }
            }
            System.out.println(count);


        }

    }
}
