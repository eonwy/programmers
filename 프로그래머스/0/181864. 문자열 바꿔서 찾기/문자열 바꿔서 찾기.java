class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "X").replace("B", "A").replace("X", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}