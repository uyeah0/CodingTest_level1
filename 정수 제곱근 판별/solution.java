class Solution {
    public long solution(long n) {
        long answer = -1;
        
        for(int i =1; i <= n/2; i++){
            if(n == (int)Math.pow(i,2)){
                answer = (int)Math.pow(i+1,2);
                break;
            }
        }
        return answer;
    }
}