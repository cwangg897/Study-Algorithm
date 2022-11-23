-- 오라클에서 쿼리문을 작성할 때 TO_CHAR() 함수는 날짜, 숫자 등의 값을 문자열로 변환하는 함수이다.
-- 자주 사용하는 기본 함수이므로 아래의 다양한 변환 방법을 알고 있으면 많은 도움이 된다.
SELECT DR_NAME, DR_ID, MCDP_CD, 
TO_CHAR(HIRE_YMD, 'YYYY-MM-DD')
FROM DOCTOR
WHERE MCDP_CD IN ('CS', 'GS')
ORDER BY HIRE_YMD DESC, DR_NAME ASC;
