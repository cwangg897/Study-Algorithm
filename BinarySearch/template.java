배열이랑 h를 받아서

k를 탐색하는건데

l = 1;
r = 최대바나나수



arr, h, 
bool condition(k){
long time = 0;
for(int i=0; i<arr.length; i++)
  time += upper(arr[i] / k ); -> 0이면 몫을더하고 나머지가있다면 +1을더해서 더해줌
}

if(time >h)
 return false;
else{
 return true;
}

알고리즘유형을알고도 접해보아라

미니멈과 멕시엄이 정해져있고 특정구간에서 컨디션이 변하는경우
최소값을 구하라 이런거

바이너리 감을깨닫는것은 특별한알고리즘없이 1부터 증가시키면서하는데
만약 어쨋든 다해봐야아는케이스면 그 경우인데 어느순간부터 컨디션이
변하는거같다라고하면 바이너리서치라고생각해라



템플릿
    int l = ${min_possible}, r = ${max_possible}

    while (l < r) {
        int m = l + (r - l) / 2;

        if (condition(m)) {
            r = m;
        } else {
            l = m + 1;
        }
    }

    return l;
}

------------------------


Split Array Largest Sum

양수로만 이루어진 배열 nums와 정수 m이 주어졌을 때, 당신은 주어진 배열을 m 개의 연속된 서브 배열로 나눌 수 있습니다. 

이 때 각 서브 배열의 합들 중에서 최대값이 가장 작게 되는 알고리즘을 작성하세요.

예제 1:
입력: nums = [7,2,5,10,8], m = 2
출력: 18
설명:
주어진 배열 nums를 m = 2개의 연속된 서브 배열로 나누는 방법은 총 4 가지가 있습니다. (굵은 숫자가 각 서브 배열의 합들 중 최대값이며 이 값이 최소가 되는 조합을 구해야함)
[7] + [2,5,10,8] = 7 + 25 -> 25
[7,2] + [5,10,8] = 9 + 23 -> 23
[7,2,5] + [10,8] = 14 + 18 -> 18
[7,2,5,10] + [8] = 24 + 8 -> 24
모든 조합들 중 최대값이 가장 작은 18을 리턴합니다

예제 2:
입력: nums = [1,2,3,4,5], m = 2
출력: 9
설명:
예제 1과 마찬가지로 m = 2개로 나누는 방법은 총 4가지입니다
[1] + [2,3,4,5] = 1 + 14 -> 14
[1,2] + [3,4,5] = 3 + 12 -> 12
[1,2,3] + [4,5] = 6 + 9 -> 9
[1,2,3,4] + [5] = 10 + 5 -> 10
모든 조합들 중 최대값이 가장 작은 9를 리턴합니다

예제 3:
입력: nums = [1,4,4], m = 3
출력: 4
설명:
nums를 m = 3개의 서브 배열로 나누는 방법은 [1] + [4] + [4] 한 가지 뿐이므로 이 중 최대값인 4를 리턴합니다

예제 4:
입력: nums = [3,4,2,5,6,7,10,2], m = 3
   14 
     1st subarray: 3, 4, 2, 5
     2nd subarray: 6, 7
     3nd subarray: 10, 2
     
출력: 14
설명:
nums를 m = 3개의 서브 배열로 나누는 여러 방법들 중 [3,4,2,5] + [6,7] + [10,2] = 14 + 13 + 12 -> 14로 나누는 방법이 모든 조합들 중 가장 작은 최대값이 됩니다


private boolean isSplittable(int sum, int[] nums, int m) {
    int curCnt = 1, curSum = 0;
    
    for (int n : nums) {
        curSum += n;
        if (curSum > sum) {
            curCnt++;
            curSum = n;
            if (curCnt > m) {
                return false;
            }
        }
    }
    
    return true;
}

    int l = 0, r = 0;
    for (int n : nums) {
        l = Math.max(l, n);
        r += n;
    }

    while (l < r) {
        int mid = l + (r - l) / 2;

        if (isSplittable(mid, nums, m)) {
            r = mid;
        } else {
            l = mid + 1;
        }
    }

    return l;


1. l = minimum index
2. r = maximum index
3. condition = condition function


    
    ,
