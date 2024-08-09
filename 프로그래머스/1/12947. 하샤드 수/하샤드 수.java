import java.util.*;

class Solution {
    public boolean solution(int x) {
        
        boolean answer = false;
        
        String num = String.valueOf(x);
        int sum = 0;
        
        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        
        if ( x % sum == 0) {
            answer = true;
        }
        
        return answer;
    }
}