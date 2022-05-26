import java.util.*;

public class Main {
    static class Schedule implements Comparable<Schedule>{
        public int start;
        public int end;

        public Schedule(int start, int end){
            this.start = start;
            this.end = end;
        }


        @Override
        public int compareTo(Schedule o) {
            if(this.end==o.end){
                return this.start - o.start;
            }

            return this.end - o.end;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Schedule[] arr = new Schedule[n];
        for(int i=0; i<n; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[i] = new Schedule(start, end);
        }

        Arrays.sort(arr);
        
        int time = arr[0].end;
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(time <= arr[i].start){
                time = arr[i].end;
                count +=1;
            }
        }

        System.out.println(count);

    }
}

// 이문제는 전형적인 알고리즘으로 빨리끝나는걸 정렬하는데
// 내가 실수한부분은 만약 끝나는 시간이 같은경우다 바로 이렇게 정렬을 커스텀할때 같은경우도 처리해주어야한다.
