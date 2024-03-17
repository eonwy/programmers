class Solution {
    public int solution(int[] array, int n) {

        int minDiff = Math.abs(array[0] - n);
        int closestValue = array[0];
        
        for(int i=0; i<array.length; i++){
            int diff = Math.abs(array[i] - n);
            if(diff < minDiff || (diff == minDiff && closestValue > array[i])){
                minDiff = diff;
                closestValue = array[i];
            }
        }
        return closestValue;
    }
}