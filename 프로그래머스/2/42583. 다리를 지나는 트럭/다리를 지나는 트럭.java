import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int currentWeight = 0;
        int count = 0;

        Queue<Integer> bridge = new LinkedList<>();

        for (int truck : truck_weights) {

            while (true) {

                if (bridge_length == bridge.size()) {
                    currentWeight -= bridge.poll();
                }

                if (bridge_length > bridge.size()) {
                    if (currentWeight + truck <= weight) {
                        bridge.offer(truck);
                        currentWeight += truck;
                        count++;
                        break;
                    } else {
                        bridge.offer(0);
                        count++;
                    }
                }
            }
        }

        return count + bridge_length;
    }
}