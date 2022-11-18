왜 Arrays sort나 Collection sort나 차이점이없는데

import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] arr;
    static boolean[] visited;
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs("",  0);
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }


    }

    public static void dfs(String str,int count){
        if(count == m){
            list.add(str);
            return;
        }

        for(int i=0; i< arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(str+arr[i]+" ", count+1);
                visited[i] = false;
            }
        }
    }
}

---------------
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[n];
		result = new int[m];
		visit = new boolean[n+1];
		
		for (int i=0; i<n; i++) {
			map[i] = sc.nextInt();
		}
		
		Arrays.sort(map);
		
		cycle(0);
		
	}

	private static void cycle(int start) {
		
		if (start == m) {
			for (int i=0; i<result.length; i++) {
				System.out.print(result[i] + " ");
			}
			System.out.println();
		} else {
			
			for (int i=0; i<n; i++) {
				if (!visit[i]) {
					visit[i] = true;
					result[start] = map[i];
					cycle(start+1);
					visit[i] = false;
				}
			}
		}
		
	}
}    
    
