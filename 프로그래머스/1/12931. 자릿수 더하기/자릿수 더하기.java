import java.util.*;

public class Solution {
    public int solution(int n) {
        
        String input = String.valueOf(n);
        int answer = 0;
        
        for (int i = 0; i < input.length(); i++) {
            answer += Character.getNumericValue(input.charAt(i));
        }
        
        return answer;
    }
}