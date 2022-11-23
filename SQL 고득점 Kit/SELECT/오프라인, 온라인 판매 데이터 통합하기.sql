-- union join차이
union은 세로로 묶지만 묶을때 공통이면 제거하는게 union이고 공통이어도
표시하는것은 union all 이다
join은 가로로 묶는다
개별이냐 하나로 보느냐의 차이이다

그리고 union연산에서 정렬은 select * from (      unionall     ) 로만 해야합니다.

SELECT * FROM(
SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE,
PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE
WHERE TO_CHAR(SALES_DATE, 'YYYY-MM') = '2022-03' 
UNION ALL
SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE,
PRODUCT_ID, NULL AS USER_ID, SALES_AMOUNT
FROM OFFLINE_SALE
WHERE TO_CHAR(SALES_DATE, 'YYYY-MM') = '2022-03'
)
ORDER BY SALES_DATE ASC, PRODUCT_ID ASC, USER_ID ASC
