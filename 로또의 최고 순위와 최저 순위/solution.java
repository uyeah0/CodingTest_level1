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
      switch(cntMin){
            case 6: answer[1] =1;break;
            case 5: answer[1] =2;break;
            case 4: answer[1] =3;break;
            case 3: answer[1] =4;break;
            case 2: answer[1] =5;break;
            default: answer[1] = 6;
        }
        switch(cntMax){
            case 6: answer[0] =1;break;
            case 5: answer[0] =2;break;
            case 4: answer[0] =3;break;
            case 3: answer[0] =4;break;
            case 2: answer[0] =5;break;
            default: answer[0] = 6;
        }
        
        return answer;
    }
}        
  
