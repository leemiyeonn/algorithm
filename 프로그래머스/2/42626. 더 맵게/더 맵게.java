import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) {
            pq.offer(i);
        }

        int count = 0;
        
        if (pq.size() < 2) {
            return -1;
        }

        while (pq.size() >= 2 && pq.peek() < K) {
            
            int n1 = pq.poll();
            int n2 = pq.poll();
            int mixed = n1 + (n2 * 2);
            
            pq.offer(mixed);
            count++;
        }
        
        if (pq.peek() < K) {
            return -1;
        }
        
        return count;
    }
}