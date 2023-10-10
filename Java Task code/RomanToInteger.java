import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        // Define a function to convert Roman numerals to integers
      // Output: 9
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        System.out.println(romanToInteger(str));
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = romanMap.get(s.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }
}