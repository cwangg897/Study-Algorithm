03이라는 문자열 추출과 포멧맞춤 출력과 null인거 제외시키는거

SELECT MEMBER_ID, 
MEMBER_NAME, 
GENDER, 
TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE TO_CHAR(DATE_OF_BIRTH, 'MM') = '03' -- 문자열로 바꿔주는거
AND GENDER = 'W' 
AND TLNO IS NOT NULL
ORDER BY MEMBER_ID ASC
