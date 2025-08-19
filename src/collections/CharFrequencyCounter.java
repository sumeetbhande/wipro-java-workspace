package collections;

import java.util.HashMap;
import java.util.Map;

public class CharFrequencyCounter {
    public static void main(String[] args) {
        String input = "hello";
        Map<Character, Integer> freqMap = new HashMap<>();

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        // Print frequency map
        System.out.println(freqMap);
    }
}
