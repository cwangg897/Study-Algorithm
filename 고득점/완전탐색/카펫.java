// 하는 yellow가 3개로 들어오는 경우도 생각했는데 이경가 center가 3이 나오나 이런생각했는데 가능했다 이식을 도출하는게 중요했다

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // brown + yellow 가 넓이
        int sum = brown + yellow;

        // 8 1
        for(int i=3; i<sum ; i++){
            int j = sum / i;
            if(sum%i == 0 && j>=3){
                int col = Math.max(i,j);
                int row = Math.min(i,j);
                int center = (col-2) * (row-2);

                if(center == yellow){
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }

        }
        return answer;
    }
}
