class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int len = lottos.length;
        int cntMin =0, cntMax = 0;
        for(int i =0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(lottos[i] == win_nums[j]) {
                    cntMin++;
                    cntMax++;
                 }
            }
            if(lottos[i] == 0) cntMax++;
        }
        answer[0] = 7-cntMax;
        answer[1] = 7-cntMin;
        return answer;
    }
}        
       
