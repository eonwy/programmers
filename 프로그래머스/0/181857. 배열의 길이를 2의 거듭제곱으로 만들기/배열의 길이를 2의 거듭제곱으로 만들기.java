import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int n = 1;
        
        while (n < length) {
            n *= 2;
        }
        
        if (n == length) {
            return arr;
        }
        
        int[] newArr = Arrays.copyOf(arr, n);
        return newArr;   
    }
}