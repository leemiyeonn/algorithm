import java.util.*;

class Solution {
    public int solution(int[] citations) {
       
        Arrays.sort(citations);

        int h = 0;

        for (int i = 0; i < citations.length; i++) {
            int citationsCount = citations[i];
            int paper = citations.length - i;

            if (citationsCount >= paper) {
                h = paper; 
                break;
            }
        }
        
        return h;
    }
}