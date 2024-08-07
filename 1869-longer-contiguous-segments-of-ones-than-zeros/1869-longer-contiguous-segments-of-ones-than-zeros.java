import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public boolean checkZeroOnes(String s) {
        if (s.length() < 2) {
            return s.charAt(0) == '1';
        }

        int maxCountZero = 0;
        int maxCountOne = 0;
        int currentCountZero = 0;
        int currentCountOne = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == '1') {
                currentCountOne++;
                currentCountZero = 0;
            } else if (currentChar == '0') {
                currentCountZero++;
                currentCountOne = 0;
            }
            maxCountOne = Math.max(maxCountOne, currentCountOne);
            maxCountZero = Math.max(maxCountZero, currentCountZero);
        }
        return maxCountOne > maxCountZero;
    }
}
