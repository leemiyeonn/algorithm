import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i : priorities) {
            q.offer(i);
        }
        
        int count = 0;
        
        while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (q.peek() == priorities[i]) {
                    q.poll();
                    count++;
                    
                    if (location == i) {
                        return count;
                    }
                }
            }
        }
        
        return count;
    }
}