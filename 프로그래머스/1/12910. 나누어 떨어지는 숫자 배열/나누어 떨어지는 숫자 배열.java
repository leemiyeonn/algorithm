import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) {
                answer.add(num);
            }
        }
        
        Collections.sort(answer);
        
        if (answer.isEmpty()) {
            return new int[]{-1};
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}