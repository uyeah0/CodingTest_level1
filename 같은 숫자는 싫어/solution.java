import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int cnt=0;
        for(int i =0 ; i < arr.length-1; i++){
            if(arr[i]==arr[i+1]) arr[i]=-1;
        }
        for(int i =0; i < arr.length; i++){
            if(arr[i] != -1) cnt++;
        }
        answer = new int[cnt];
        cnt =0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] != -1) {
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        //dsdSystem.out.println();

        return answer;
    }
}