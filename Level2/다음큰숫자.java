class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=n+1; i<=1000000; i++){
            String s1 = Integer.toBinaryString(n);
            String s2 = Integer.toBinaryString(i);
            int count1 = 0;
            int count2 = 0;
            for(int j=0; j<s1.length(); j++){
                if(s1.charAt(j)=='1'){
                    count1+=1;
                }
            }

            for(int j=0; j<s2.length(); j++){
                if(s2.charAt(j)=='1'){
                    count2+=1;
                }
            }
            if(count1 == count2){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
