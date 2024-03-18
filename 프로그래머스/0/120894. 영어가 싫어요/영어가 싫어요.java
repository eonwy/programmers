import java.util.*;

class Solution {
    public long solution(String numbers) {
        
        HashMap<String, Integer> map = new HashMap<String, Integer>(){{
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
        }};
        
        for(String x : map.keySet()) 
            // x(two)에 해당하는 대응되는 값(2)을 map.get(x)로 가져옴
            // toString을 이용해 numbers는 지금 String형태임
            numbers = numbers.replaceAll(x, Integer.toString(map.get(x)));

        return Long.parseLong(numbers);
    }
}