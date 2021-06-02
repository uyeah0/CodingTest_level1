class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int s,e,l;
        
        
        for(int i =0; i < commands.length; i++){
                s = commands[i][0]-1;//1
                e = commands[i][1]-1;//4
                l = commands[i][2];//3
            for(int j =s; j <e; j++ ){
                for(int k = i+1; k <= e; k++  ){
                    
                }
            }
 
        }
        return answer;
    }
}