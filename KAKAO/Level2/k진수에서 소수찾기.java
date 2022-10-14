Long을 활용 만약 길어질경우가있기때문이다


class Solution {
    public long solution(int n, int k) {
        int answer = 0;
        String s = "";
        if(k==10){
            s = String.valueOf(n);
        } else{
            while(n != 0){
                s = (n%k)+s;
                n = n/k;
            }
        }

        String[] split = s.split("0");
        for(int i=0; i< split.length; i++){
            if(split[i].isEmpty()){
                continue;
            }
            long num = Long.parseLong(split[i]);
            if(num == 1){
                continue;
            }
            if(isPrime(num) == 1){
                answer+=1;
            }
        }
        return answer;
    }

    static long isPrime(long num) {
        for (int i = 2; i<=(int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

}
