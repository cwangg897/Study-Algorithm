package com.company;

import java.util.*;

public class Main {
    static int[][] map ;
    static boolean[][] visited ;

    static int[] dx = {0,0,-1,1}; // 상 하 좌 우
    static int[] dy = {1,-1,0,0}; // 상 하 좌 우
    static int n;

    static int idx = 1;
    static List<Integer> dange = new ArrayList<>();
    static int dNum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];

        sc.nextLine();
        for(int i=0; i<n; i++){
            String[] str = sc.nextLine().split("");
            for(int j=0; j<n; j++){
                map[i+1][j+1] = Integer.valueOf(str[j]);
            }
        }


        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(!visited[i][j] && map[i][j]==1){
                    dNum = 0;
                    visited[i][j] = true;
                    dNum +=1;
                    bfs(i, j);
                    dange.add(dNum);
                    idx++;
                }
            }
        }

        Collections.sort(dange);

        System.out.println(dange.size());
        for(int i=0; i<dange.size(); i++){
            System.out.println(dange.get(i));
        }

    }

    public static void bfs(int x, int y){
        Deque<Node> deque = new ArrayDeque<>();
        Node start = new Node(x,y);
        deque.offer(start);

        while(!deque.isEmpty()){
            Node pNode = deque.poll();
            for(int i=0; i<4; i++){
                int nx = pNode.getX() + dx[i];
                int ny = pNode.getY() + dy[i];

                if(nx<1 || nx>n || ny<1 || ny>n){
                    continue;
                }
                if(!visited[nx][ny] && map[nx][ny]==1){
                    Node nNode = new Node(nx, ny);
                    visited[nx][ny] = true;
                    deque.offer(nNode);
                    dNum +=1;
                }

            }
        }

    }

    private static class Node {
        public int x;
        public int y;

        public Node(int x, int y){
            this.x =  x;
            this. y = y;
        }

        public int getX(){
            return this.x;
        }

        public int getY(){
            return this.y;
        }
    }
}

// 풀이는 익숙하지않아서 그렇지 dfs보다 bfs로 하는게 편했다 그리고 배열을 사용하면 메모리 낭비가생길수있고 또한 연산횟수도 추가되므로 List자료구조를 이용했다
