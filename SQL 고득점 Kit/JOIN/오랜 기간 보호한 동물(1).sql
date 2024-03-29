SELECT * FROM(
SELECT NAME, DATETIME
FROM ANIMAL_INS
WHERE ANIMAL_ID NOT IN (SELECT AI.ANIMAL_ID
FROM ANIMAL_INS AI INNER JOIN(SELECT ANIMAL_ID
                             FROM ANIMAL_OUTS) AO
ON AI.ANIMAL_ID = AO.ANIMAL_ID)
ORDER BY DATETIME
)
    WHERE ROWNUM <=3

