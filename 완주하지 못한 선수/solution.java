class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        for(int i =0; i < participant.length; i++){
            for(int j =0; j < completion.length; j++){
                if(participant[i].equals(completion[j])){
                    completion[j] = "";
                    participant[i]="";
                    break;
                }
            }
            if(participant[i] != ""){
                answer = participant[i];
            }
        }
        
        
        return answer;
    }
}