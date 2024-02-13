import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] arrays = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        
        Arrays.sort(arrays, (a, b) -> (b + a).compareTo(a + b));
        
        if (arrays[0].equals("0")) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (String s : arrays) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}