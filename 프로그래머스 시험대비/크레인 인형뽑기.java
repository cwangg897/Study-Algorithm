import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i< moves.length; i++){
            int p = moves[i] - 1;
            for(int j=0; j<board[p].length; j++){
                if(board[j][p] != 0){
                    if(!stack.isEmpty() && stack.peek() == board[j][p]){
                        stack.pop();
                        answer +=2;
                    } else{
                        stack.add(board[j][p]);
                    }
                    board[j][p] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
