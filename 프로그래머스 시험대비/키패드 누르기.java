class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Position left = new Position(1, 4);
        Position right = new Position(3, 4);

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num == 1 || num == 4 || num == 7) {
                left.x = 1;
                left.y = (num / 3) + 1;
                sb.append("L");
            } else if (num == 3 || num == 6 || num == 9) {
                right.x = 3;
                right.y = num / 3;
                sb.append("R");
            } else {
                int x;
                int y;
                if(num == 0){
                    x = 2;
                    y = 4;
                } else{
                    x = 2;
                    y = (num / 3) + 1;
                }
                int leftL = Math.abs(x - left.x) + Math.abs(y - left.y);
                int rightL = Math.abs(x - right.x) + Math.abs(y - right.y);
                if (leftL == rightL) {
                    if (hand.equals("left")) {
                        left.x = x;
                        left.y = y;
                        sb.append('L');
                    } else {
                        right.x = x;
                        right.y = y;
                        sb.append('R');
                    }
                } else if (leftL < rightL) {
                    // left로 하기
                    left.x = x;
                    left.y = y;
                    sb.append("L");
                } else if (leftL > rightL) {
                    // right로 하기
                    right.x = x;
                    right.y = y;
                    sb.append("R");
                }
            }
        }
        answer = sb.toString();
        return answer;
    }


    static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
