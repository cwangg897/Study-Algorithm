JOIN을 사용하자 정리를해서 맞추는것이다


SELECT FP.PRODUCT_ID, FP.PRODUCT_NAME, (FP.PRICE*PI.AMOUNT) AS TOTAL_SALES  
FROM FOOD_PRODUCT FP INNER JOIN (SELECT PRODUCT_ID, SUM(AMOUNT) AS AMOUNT
FROM FOOD_ORDER
WHERE TO_CHAR(PRODUCE_DATE, 'YYYY-MM') = '2022-05'
GROUP BY PRODUCT_ID) PI
ON FP.PRODUCT_ID = PI.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, FP.PRODUCT_ID ASC

