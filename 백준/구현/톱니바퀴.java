회전하는거 수도코드로하고 푸는데 재귀적으로하는게 BEST 이러한 코드를 짤수있도록하자


import java.util.*;

public class Main {
    static int[][] arr = new int[5][8];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=4; i++){
            String[] s = sc.nextLine().split("");
            for(int j=0; j<s.length; j++){
                arr[i][j] = Integer.parseInt(s[j]);
            }
        }
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int point = sc.nextInt();
            int direction = sc.nextInt();
            gearOperation(point, direction);
        }


        int count = 0;
        if(arr[1][0] == 1) count +=1;

        if(arr[2][0] == 1) count +=2;

        if(arr[3][0] == 1) count +=4;

        if(arr[4][0] == 1) count +=8;
        System.out.println(count);


    }

    public static void gearOperation(int idx, int dir) {
        // 왼쪽 (0 ~ idx-1)
        leftSide(idx-1, -dir);
        // 오른쪽 (idx+1 ~ 3)
        rightSide(idx+1, -dir);
        circle(idx,dir);
    }

    public static void leftSide(int idx, int dir) {
        if(idx < 1) return;
        if(arr[idx][2]==arr[idx+1][6]) return;
        leftSide(idx-1, -dir);
        circle(idx,dir);
    }

    public static void rightSide(int idx, int dir) {
        if(idx > 4) return;
        if(arr[idx][6] == arr[idx-1][2]) return;
        rightSide(idx+1, -dir);
        circle(idx,dir);
    }




    public static void circle(int idx, int direction){
        // 시계방향
        if(direction == 1){
            int tail = arr[idx][7];
            for(int i=7; i>=1; i--){
                arr[idx][i] = arr[idx][i-1];
            }
            arr[idx][0] = tail;
        }
        // 반시계
        else {
            int head = arr[idx][0];
            for(int i=0; i<=6; i++){
                arr[idx][i] = arr[idx][i+1];
            }
            arr[idx][7] = head;
        }
    }
}
