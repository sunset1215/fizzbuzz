package org.sunset1215.tdd.fizzbuzz.game;

import org.apache.commons.lang3.StringUtils;

public class FizzBuzz {
    
    private static final int FIZZ_FACTOR = 3;
    private static final int BUZZ_FACTOR = 5;
    
    public String getWord(int number) {
        String result = "";
        
        if (isWord(FIZZ_FACTOR, number)) {
            result += "Fizz";
        }
        
        if (isWord(BUZZ_FACTOR, number)) {
            result += "Buzz";
        }
        
        if (StringUtils.isEmpty(result)) {
            result = String.valueOf(number);
        }
        
        return result;
    }
    
    private boolean isWord(final int factor, final int number) {
        return isDivisibleBy(factor, number) || containValue(factor, number);
    }
    
    private boolean containValue(int value, int number) {
        return String.valueOf(number).contains(String.valueOf(value));
    }
    
    private boolean isDivisibleBy(int factor, int number) {
        return number % factor == 0;
    }
}
