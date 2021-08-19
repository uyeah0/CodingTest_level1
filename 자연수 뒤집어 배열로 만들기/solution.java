class Solution {
    public long[] solution(long n) {
        String str = String.valueOf(n);
        long[] answer = new long[str.length()];
        int cnt =0;
        while(n!=0){
            answer[cnt] = n%10;
            n /= 10;
            cnt++;
        }
        return answer;
    }
}