import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLettersSmallerThanKTimes {
    public static void main(String[] args) {
        String input = "bdefdade";
        System.out.println(lengthOfLongestSubstringKTimes(input, 3));
    }

    public static int lengthOfLongestSubstringKTimes(String input, int k) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int globalMax = -1;
        Map<Character, Integer> map = new HashMap<>();
        while (right < input.length()) {
            char ch = input.charAt(right);
            Integer ct = map.get(ch);
            if (ct == null) {
                map.put(ch, 1);
                right++;
            } else if (ct < k) {
                map.put(ch, ct + 1);
                right++;
            } else {
                map.put(input.charAt(left), map.get(input.charAt(left)) - 1);
                left++;
            }
            globalMax = Math.max(globalMax, right - left);
        }
        return globalMax;
    }
}
// TC: O(n + d)
// SC: O(d)