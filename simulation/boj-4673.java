public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=100; i++){
            if(check(i)){
                continue;
            } else{
                System.out.println(i);
            }
        }

    }

    static boolean check(int n){
        for(int i=1; i<n; i++){

            String str = String.valueOf(i);
            int sum = 0;
            for(int j=0; j<str.length(); j++){
                sum += str.charAt(j)-48;
            }
            sum += i;
            if(sum == n){
                return true;
            }
        }
        return false;
    }
}
// 셀프넘버 
