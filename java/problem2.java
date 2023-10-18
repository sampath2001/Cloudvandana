//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        String roman = "IX"; 

        Map<Character, Integer> romanToInt = new HashMap<>();
        romanToInt.put('I', 1);
        romanToInt.put('V', 5);
        romanToInt.put('X', 10);
        romanToInt.put('L', 50);
        romanToInt.put('C', 100);
        romanToInt.put('D', 500);
        romanToInt.put('M', 1000);

        int result = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char c = roman.charAt(i);
            int value = romanToInt.get(c);
            if (i < roman.length() - 1 && value < romanToInt.get(roman.charAt(i + 1))) {
                result -= value;
            } else {
                result += value;
            }
        }

        System.out.println("The integer value of " + roman + " is: " + result);
    }
}