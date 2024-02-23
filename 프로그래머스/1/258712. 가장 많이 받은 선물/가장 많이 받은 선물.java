import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        HashMap<String, HashMap<String, Integer>> giftRecord = new HashMap<>();
        HashMap<String, Integer> giftScore = new HashMap<>();
        HashMap<String, Integer> nextScore = new HashMap<>();
        
        for (String friend : friends) {
            giftRecord.put(friend, new HashMap<>());
            giftScore.put(friend, 0);
            nextScore.put(friend, 0);
        }
        
        for (String gift : gifts) {
            String[] splitGift = gift.split(" ");
            String giver = splitGift[0];
            String receiver = splitGift[1];
            
            giftRecord.get(giver).put(receiver, giftRecord.get(giver).getOrDefault(receiver, 0) + 1);
            
            giftScore.put(giver, giftScore.getOrDefault(giver, 0) + 1);
            giftScore.put(receiver, giftScore.getOrDefault(receiver, 0) - 1);
        }
        
        for (String giver : friends) {
            for (String receiver : friends) {
                if (!giver.equals(receiver)) {
                    
                    int giftFromGiver = giftRecord.get(giver).getOrDefault(receiver, 0);
                    int giftFromreceiver = giftRecord.get(receiver).getOrDefault(giver, 0);
                    
                    if (giftFromGiver > giftFromreceiver) {
                        nextScore.put(giver, nextScore.getOrDefault(giver, 0) + 1);
                    } else if (giftFromGiver == giftFromreceiver && giftScore.get(giver) > giftScore.get(receiver)) {
                        nextScore.put(giver, nextScore.getOrDefault(giver, 0) + 1);
                    }
                }
            }
        }

        return Collections.max(nextScore.values());
    }
}