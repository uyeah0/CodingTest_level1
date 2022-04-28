import java.util.*;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList();
        
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                list.add(numbers[i]+numbers[j]);
            }
        }
        HashSet<Integer> set = new HashSet<>(); // set은 중복 비허용
        set.addAll(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);
        
        answer = new int[list.size()];
        int size=0;
        for(int i : list){
            answer[size++] = i;
        }
        
        Arrays.sort(answer); // 정렬
        return answer;
    }
}