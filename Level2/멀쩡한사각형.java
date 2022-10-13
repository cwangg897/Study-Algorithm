https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%A9%80%EC%A9%A1%ED%95%9C-%EC%82%AC%EA%B0%81%ED%98%95-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java
정답은 = (w * h) - (((w / 최대공약수) + (h / 최대공약수) - 1) * 최대공약수)

그림으로 잘리는 위치마다 좌표를 찾으면 공통점이 있다.
그 공통점을 찾아내면 2,3  8와 12로 였는데 4로 나누는경우다 그렇다면 이 4는 무엇인가? 바로 8과 12의 최대공약수였다
 
 
이때 사용하지 못하는 정사각형을 구하기 위해서는 총 정사각형 갯수 - (가로 길이 + 세로길이 - 1)
  
또한 BigInteger를 사용해야한다 숫자범위가 1억 이하의 자연수라서 그리고 정답 계산시에 long사용해야한다.
  
한마디로 문제가 역겹다 억지로 내는거같다.
  
  import java.math.BigInteger;
import java.util.*;

class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        // 최대 공약수 구하는공식
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        answer = ((long)w * (long)h) - ((((long)w /gcd) + ((long)h /gcd) - 1) * gcd);

        return answer;
    }
}
