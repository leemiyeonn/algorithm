import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> daysQ = new LinkedList<>();
        Queue<Integer> resultQ = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                day++;
            }
            daysQ.offer(day);
        }

        while(!daysQ.isEmpty()) {
            int count = 1;
            int current = daysQ.poll();
            while (!daysQ.isEmpty() && current >= daysQ.peek()) {
                count++;
                daysQ.poll();
            }
            resultQ.offer(count);
        }
        
        int[] result = new int[resultQ.size()];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = resultQ.poll();
        }
        
        return result;
    }
}
