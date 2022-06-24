package com.company;

import java.util.*;

public class Main {
    static int[][] graph ;
    static boolean[] visited ;
    static int n;

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        dfs(1);
        System.out.println(count);

    }

    public static void dfs(int v){
        visited[v] = true;
        for(int i=1; i<=n; i++){
            if(graph[v][i] == 1 && !visited[i]){
                dfs(i);
                count +=1;
            }
        }
    }
}

// bfs로 풀면은 count출력을 bfs메소드 안에서 while문이 끝난후 가능하다
// https://fbtmdwhd33.tistory.com/28
