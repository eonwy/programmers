-- 코드를 작성해주세요
SELECT
    T.ITEM_ID,
    I.ITEM_NAME
FROM
    ITEM_TREE T
JOIN
    ITEM_INFO I
ON
    T.ITEM_ID = I.ITEM_ID
WHERE
    T.PARENT_ITEM_ID IS NULL
ORDER BY
    T.ITEM_ID