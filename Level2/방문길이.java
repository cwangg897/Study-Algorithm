8번 이후로 다 안되시는 분들 참고
왼쪽에서 오른쪽으로 간 길과, 오른쪽에서 왼쪽으로 간 길은 같은 길.

나는 배열을 이용하지않았고 또한 Set을 이용하려다보니 hashCode랑 equals를 재정의해야해서 이건아닌것같았다.
또한 반례가 이미지나긴길 UDU인 경우다 그래서 배열을 이용하는것이고 배열도 2차원이 아니라 3차원으로도 사용해도되는것이었다.
  
또한 배열판으로 해결해야한다
나는  
String s = "";
s += x+"_"+y+"to"; 으로 이용해서 틀렸고 +연산은 비효율적이다.
  
https://ilmiodiario.tistory.com/97 이코드보다는 나는 4차원 배열을 사용하는것이 더 좋았다
  

class Solution {
    static int[] dx = {-1,1,0,0}; // 상 하 좌 우
    static int[] dy = {0,0,-1,1}; // 상 하 좌 우

    public int solution(String dirs) {
        int answer = 0;
        int x = 5;
        int y = 5;
        boolean[][][][] visited = new boolean[11][11][11][11];

        for(int i=0; i<dirs.length(); i++){
            char c = dirs.charAt(i);
            int d = 0;
            if(c == 'U'){
                d = 0;
            }
            if(c == 'D'){
                d = 1;
            }

            if(c == 'L'){
                d = 2;
            }

            if(c== 'R'){
                d = 3;
            }

            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx < 0 || nx>=11 || ny<0 || ny>=11){
                continue;
            }

            if(!visited[nx][ny][x][y] && !visited[x][y][nx][ny]){
                visited[x][y][nx][ny] = true;
                visited[nx][ny][x][y] = true;
                answer+=1;
            }

            x = nx;
            y = ny;
        }
        return answer;
    }
}
