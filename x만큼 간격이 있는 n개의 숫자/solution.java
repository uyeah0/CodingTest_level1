class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0]=0;
        long x1 = x;
        for(int i =0; i < n; i++){
            answer[i] = x1*(i+1);
        }
        
        return answer;
    }
}