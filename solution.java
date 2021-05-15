class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int l = moves.length;
        int cnt=0,n,cntR =0;
        int result[] = new int[l];
        
        while(cnt < l){
            n = moves[cnt]-1;
            for(int j = 0; j < board[0].length; j++){
                if(board[n][j] != 0){
                    result[cntR] = board[n][j];
                    board[n][j]=0;
                    cnt++;
                    cntR++;
                    break;
                }
            }
            for(int k =0; k < l-1; k++){
                for(int y = k+1; y <l; k++){
                    if(result[k]==result[y] && result[k]!=0){
                        result[k]=0;
                        result[y]=0;
                        cntR = cntR-2;
                    }
                }
            }
        }
        int c=0;
        for(int i =0; i < result.length; i++){
            if(result[i]!=0)c++;
        }
        
        return answer;
    }
}