최대공약수 최소공배수 활용할수있는지 물어보는거

// 최소공배수
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        if(arr.length ==1){
            return arr[0];
        }
        int num = arr[0];
        for(int i=1; i< arr.length; i++){
            int g = getGCD(num, arr[i]);
            num = (num * arr[i])/ g;
        }
        answer = num;
        return answer;
    }
    public int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}
