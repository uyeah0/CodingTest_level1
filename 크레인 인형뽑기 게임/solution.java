class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int l = moves.length;
        int cnt=0,n,cntR =0;
        int result[] = new int[board[0].length]; // board길이만큼result배열생성
        
        while(cnt < l){
            
            for(int j = 0; j < board[0].length; j++){
                n = moves[cnt]-1;
                if(board[j][n] != 0){
                    result[cntR] = board[j][n];
                    board[j][n]=0;
                    cntR++;
                    break;
                }
            }
            for(int k =0; k < result.length-1; k++){  // 정답 배열 비교 터트리기 
                for(int y = k+1; y <result.length; k++){
                    if(result[k]==result[y] && result[k]!=0){
                        result[k]=0;
                        result[y]=0;
                        cntR = cntR-2;
                        answer ++;
                        break;
                    }
                }
            }
            cnt++;
            
        }
    
        return answer;
    }
}
