class Solution {
    public String solution(String myString, String pat) {
        StringBuffer sb = new StringBuffer(myString);        
	    String myStringReverse = sb.reverse().toString();
        StringBuffer sbsb = new StringBuffer(pat);        
	    String patReverse = sbsb.reverse().toString(); 
        
        int index = myStringReverse.indexOf(patReverse);
        
        return myString.substring(0, myString.length() - index);
    }
}