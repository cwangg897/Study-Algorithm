3개의 수라고해서 3중 for문을 사용했다

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)){
                        answer+=1;
                    }
                }
            }
        }
        return answer;
    }

    public static boolean isPrime(int sum){
        boolean check = true;
        for(int i=2; i<sum; i++){
            if(sum % i == 0){
                check = false;
                break;
            }
        }


        return check;
    }



}
