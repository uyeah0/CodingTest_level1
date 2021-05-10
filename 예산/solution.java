class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum =0;
        
        for(int i =0; i < d.length-1; i++){
            for(int j =i+1; j < d.length; j++){
                if( d[i] > d[j]){
                    int t = d[i];
                    d[i] = d[j];
                    d[j] = t;
                }
            }
        }
        for(int i =0; i < d.length; i++){
            sum += d[i];
            if(sum > budget) break;
            answer++;
        }
        
        
        return answer;
    }
}