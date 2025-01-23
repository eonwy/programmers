-- 코드를 작성해주세요
SELECT 
    COUNT(*) 
AS 
    COUNT 
FROM 
    ECOLI_DATA ED
WHERE
    (ED.GENOTYPE & 2) != 2
    AND ((ED.GENOTYPE & 1) = 1 OR (ED.GENOTYPE & 4) = 4);

