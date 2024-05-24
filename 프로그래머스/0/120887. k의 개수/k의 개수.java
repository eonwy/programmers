class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = Integer.toString(k);
        
        for(int z=i; z<=j; z++){
            String str = Integer.toString(z);
            
            if(str.contains(kStr)){
                String[] arr = str.split("");
                
                for(String arrSplit : arr){
                    if(arrSplit.equals(kStr)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}