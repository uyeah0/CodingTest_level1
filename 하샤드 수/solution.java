class Solution {
    public boolean solution(int x) {
        boolean answer = true;
         int a, sum =0;
        if(x>10){
            a =x;
            while(a!=0){
                sum += a%10;
                a /= 10;
            }
            if( x % sum !=0) answer = false;
        }


            return answer;
    }
}